package com.grpc.ums.repositories;


import com.grpc.ums.entities.Student;


import java.util.List;


public interface StudentRepository {
    public Student saveStudent(Student student);

    public Student getStudentById(Long student_id);
    public List<Student> getAllStudents();
    public void updateStudent(Long student_id, Student student);
    public void deleteStudent(Long student_id);
}
