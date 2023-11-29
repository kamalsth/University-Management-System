package com.grpc.ums.adapter;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TableCreationService {
    private final JdbcTemplate jdbcTemplate;

    public TableCreationService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTablesIfNotExist() {


        String createStudentTableQuery = "CREATE TABLE IF NOT EXISTS student ("
                + "student_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,"
                + "name VARCHAR(255) NOT NULL,"
                + "email VARCHAR(255) NOT NULL,"
                + "address VARCHAR(255) NOT NULL,"
                + "phone VARCHAR(255) NOT NULL"
                + ")";
        createTableIfNotExists("student", createStudentTableQuery);

        String createDepartmentTableQuery = "CREATE TABLE IF NOT EXISTS department ("
                + "department_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,"
                + "name VARCHAR(255) NOT NULL"
                + ")";
        createTableIfNotExists("department", createDepartmentTableQuery);

        String createUniversityTableQuery= "CREATE TABLE IF NOT EXISTS university ("
                + "university_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,"
                + "name VARCHAR(255) NOT NULL,"
                + "location VARCHAR(255) NOT NULL,"
                + "student_id INT NOT NULL,"
                + "department_id INT NOT NULL,"
                + "FOREIGN KEY (student_id) REFERENCES student(student_id),"
                + "FOREIGN KEY (department_id) REFERENCES department(department_id)"
                + ")";
        createTableIfNotExists("university", createUniversityTableQuery);


    }



    private void createTableIfNotExists(String tableName, String createTableQuery) {
        if (!tableExists(tableName)) {
            jdbcTemplate.execute(createTableQuery);
            System.out.println("Table " + tableName + " created successfully.");
        } else {
            System.out.println("Table " + tableName + " already exists.");
        }
    }

    private boolean tableExists(String tableName) {
        String checkTableQuery = "SHOW TABLES LIKE ?";
        return jdbcTemplate.queryForList(checkTableQuery, tableName).size() > 0;
    }

}
