package com.grpc.ums.repositories;


import com.grpc.ums.entities.Student;


import java.util.List;


public interface StudentRepository {
    public Student saveStudent(Student student);

    public Student getStudentById(long student_id);
    public List<Student> getAllStudents();
    public void updateStudent(long student_id, Student student);
    public void deleteStudent(long student_id);
}
