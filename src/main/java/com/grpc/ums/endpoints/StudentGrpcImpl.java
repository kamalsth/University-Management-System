package com.grpc.ums.endpoints;

import com.grpc.ums.facade.StudentFacade;
import generatedClasses.StudentOuterClass;
import generatedClasses.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

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

    }

    @Override
    public void deleteStudent(StudentOuterClass.StudentRequest request, StreamObserver<StudentOuterClass.EmptyResponse1> responseObserver) {
    }

    @Override
    public void updateStudent(StudentOuterClass.StudentRequest request, StreamObserver<StudentOuterClass.Student> responseObserver) {
    }
}
