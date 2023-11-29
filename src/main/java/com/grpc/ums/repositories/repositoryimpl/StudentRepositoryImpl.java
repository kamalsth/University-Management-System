package com.grpc.ums.repositories.repositoryimpl;

import com.grpc.ums.entities.Student;
import com.grpc.ums.repositories.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final DataSource dataSource;

    public StudentRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Student saveStudent(Student student) {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Connected to the database");
            try (Statement statement = connection.createStatement()) {
                String sql = "INSERT INTO student (name, email, address, phone) VALUES ('" + student.getName() + "', '" + student.getEmail() + "', '" + student.getAddress() + "', '" + student.getPhone() + "')";
                statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
                System.out.println("Student saved successfully");
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        student.setStudent_id(generatedKeys.getLong(1));
                    } else {
                        throw new SQLException("Creating student failed, no ID obtained.");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error executing the SQL query" + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database" + e.getMessage());
        }
        return student;
    }

    @Override
    public Student getStudentById(Long student_id) {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Connected to the database");
            try (Statement statement = connection.createStatement()) {
                String sql = "SELECT * FROM student WHERE student_id = " + student_id;
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    return mapToStudent(resultSet);
                }
            } catch (SQLException e) {
                System.out.println("Error executing the SQL query" + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();

        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Connected to the database");
            try (Statement statement = connection.createStatement()) {
                String sql = "SELECT * FROM student";
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    studentList.add(mapToStudent(resultSet));
                }
            } catch (SQLException e) {
                System.out.println("Error executing the SQL query" + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database" + e.getMessage());
        }

        return studentList;

    }

    @Override
    public void updateStudent(Long student_id, Student student) {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Connected to the database");
            try (Statement statement = connection.createStatement()) {
                String sql = "UPDATE student SET name = '" + student.getName() + "', email = '" + student.getEmail() + "', address = '" + student.getAddress() + "', phone = '" + student.getPhone() + "' WHERE student_id = " + student_id;
                int rowsUpdated = statement.executeUpdate(sql);

                if (rowsUpdated > 0) {
                    System.out.println("Student updated successfully");
                } else {
                    System.out.println("No student found with id: " + student_id);
                }
            } catch (SQLException e) {
                System.out.println("Error executing the SQL query" + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database" + e.getMessage());
        }
    }

    @Override
    public void deleteStudent(Long student_id) {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Connected to the database");
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student WHERE student_id=" + student_id;

            int rowsDeleted = statement.executeUpdate(sql);

            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("No student found with id: " + student_id);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database or executing the SQL delete query: " + e.getMessage());
        }
    }

    private Student mapToStudent(ResultSet resultSet) throws SQLException {
        long student_id = resultSet.getLong("student_id");
        String name = resultSet.getString("name");
        String email = resultSet.getString("email");
        String address = resultSet.getString("address");
        String phone = resultSet.getString("phone");
        return new Student(student_id, name, email, address, phone);
    }
}
