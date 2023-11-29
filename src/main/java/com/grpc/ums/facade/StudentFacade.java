package com.grpc.ums.facade;

import com.grpc.ums.entities.Student;
import com.grpc.ums.services.StudentService;
import generatedClasses.StudentOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentFacade {
    private final StudentService studentService;
    private final ModelMapper modelMapper;

    public StudentFacade(StudentService studentService, ModelMapper modelMapper) {
        this.studentService = studentService;
        this.modelMapper = modelMapper;
    }


    public StudentOuterClass.Student saveStudent(StudentOuterClass.Student student) {
        System.out.println("Student from outerClass = "+student);
        Student student1 = mapToEntity(student);
        System.out.println("Student after mapping= "+student1.toString());
        System.out.println("Student id after mapping to entity = "+student1.getStudent_id());
        StudentOuterClass.Student student2= mapToProto(studentService.saveStudent(student1));
        System.out.println("\nStudent after mapping to proto= "+student2);
        return student2;
    }

    public StudentOuterClass.Student getStudentById(Long student_id) {
        System.out.println("Student id= "+student_id);
        return mapToProto(studentService.getStudentById(student_id));
    }

    //
//    public StudentOuterClass.Student saveStudent(StudentOuterClass.Student student) {
//        Student student1 = mapToEntity(student);
//        return mapToProto(studentService.saveStudent(student1));
//    }
//
//
//    public StudentOuterClass.Student getStudentById(Long student_id) {
//        return mapToProto(studentService.getStudentById(student_id));
//    }
//
//    public StudentOuterClass.StudentsResponse getAllStudents() {
//        return null;
//    }
    private Student mapToEntity(StudentOuterClass.Student student) {
        System.out.println("Student id in map ="+student.getStudentId());
        Student student1= modelMapper.map(student,Student.class);
//        student1.setStudent_id(student.getStudentId());
        return student1;
    }

    private StudentOuterClass.Student mapToProto(Student student) {
        System.out.println("Student id in map to proto ="+student.getStudent_id());
        System.out.println("Student in map to proto ="+student.toString());
        StudentOuterClass.Student student1= StudentOuterClass.Student.newBuilder()
                .setStudentId(student.getStudent_id())
                .setName(student.getName())
                .setEmail(student.getEmail())
                .setAddress(student.getAddress())
                .setPhone(student.getPhone())
                .build();
        System.out.println("Student id in map to proto ="+student1.getStudentId());
        System.out.println("Student in map to proto ="+student1);
        return student1;
    }

}
