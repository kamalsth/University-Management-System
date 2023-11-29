package com.grpc.ums.facade;

import com.grpc.ums.entities.Student;
import com.grpc.ums.services.StudentService;
import generatedClasses.StudentOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentFacade {
    private final StudentService studentService;
    private final ModelMapper modelMapper;

    public StudentFacade(StudentService studentService, ModelMapper modelMapper) {
        this.studentService = studentService;
        this.modelMapper = modelMapper;
    }


    public StudentOuterClass.Student saveStudent(StudentOuterClass.Student student) {
        Student student1 = mapToEntity(student);
        return mapToProto(studentService.saveStudent(student1));
    }

    public StudentOuterClass.Student getStudentById(long student_id) {
        return mapToProto(studentService.getStudentById(student_id));
    }


    public List<StudentOuterClass.Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return students.stream()
                .map(this::mapToProto)
                .collect(Collectors.toList());
    }

    public StudentOuterClass.Student updateStudent(long student_id, StudentOuterClass.Student student) {
        Student student1 = mapToEntity(student);
        studentService.updateStudent(student_id, student1);
        student1.setStudent_id(student_id);
        return mapToProto(student1);
    }


    public void deleteStudent(long student_id) {
        studentService.deleteStudent(student_id);
    }

    private Student mapToEntity(StudentOuterClass.Student student) {
        return modelMapper.map(student, Student.class);
    }

    private StudentOuterClass.Student mapToProto(Student student) {
        return StudentOuterClass.Student.newBuilder()
                .setStudentId(student.getStudent_id())
                .setName(student.getName())
                .setEmail(student.getEmail())
                .setAddress(student.getAddress())
                .setPhone(student.getPhone())
                .build();
    }

}
