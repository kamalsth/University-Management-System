package com.grpc.ums.services.serviceimpl;


import com.grpc.ums.entities.Student;
import com.grpc.ums.repositories.StudentRepository;
import com.grpc.ums.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {
    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    @Override
    public Student getStudentById(Long student_id) {
        return studentRepository.getStudentById(student_id);
    }


    @Override
    public void updateStudent(Long student_id, Student student) {
        studentRepository.updateStudent(student_id, student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public void deleteStudent(Long student_id) {
        studentRepository.deleteStudent(student_id);
    }


}
