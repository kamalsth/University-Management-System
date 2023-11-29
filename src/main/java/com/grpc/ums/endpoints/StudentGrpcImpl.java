package com.grpc.ums.endpoints;

import com.grpc.ums.facade.StudentFacade;
import generatedClasses.StudentOuterClass;
import generatedClasses.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class StudentGrpcImpl extends StudentServiceGrpc.StudentServiceImplBase {
    private final StudentFacade studentFacade;

    public StudentGrpcImpl(StudentFacade studentFacade) {
        this.studentFacade = studentFacade;
    }

    @Override
    public void addStudent(StudentOuterClass.Student request, StreamObserver<StudentOuterClass.Student> responseObserver) {
        StudentOuterClass.Student response = studentFacade.saveStudent(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getStudent(StudentOuterClass.StudentRequest request, StreamObserver<StudentOuterClass.Student> responseObserver) {
        StudentOuterClass.Student response = studentFacade.getStudentById(request.getStudentId());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllStudents(StudentOuterClass.EmptyRequest1 request, StreamObserver<StudentOuterClass.StudentsResponse> responseObserver) {
        List<StudentOuterClass.Student> students = studentFacade.getAllStudents();
        StudentOuterClass.StudentsResponse response = StudentOuterClass.StudentsResponse.newBuilder()
                .addAllStudents(students)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override
    public void updateStudent(StudentOuterClass.Student request, StreamObserver<StudentOuterClass.Student> responseObserver) {
        long student_id = request.getStudentId();
        StudentOuterClass.Student response = studentFacade.updateStudent(student_id, request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void deleteStudent(StudentOuterClass.StudentRequest request, StreamObserver<StudentOuterClass.EmptyResponse1> responseObserver) {
        long student_id = request.getStudentId();
        studentFacade.deleteStudent(student_id);
        StudentOuterClass.EmptyResponse1 response = StudentOuterClass.EmptyResponse1.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}
