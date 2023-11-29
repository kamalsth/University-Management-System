package com.grpc.ums.services;

import com.grpc.ums.entities.Student;

import java.util.List;

public interface StudentService {


    public Student saveStudent(Student student);

    public Student getStudentById(Long student_id);

    public void updateStudent(Long student_id, Student student);

    public List<Student> getAllStudents();

    public void deleteStudent(Long student_id);

}
