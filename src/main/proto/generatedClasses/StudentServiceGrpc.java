package generatedClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: student.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student,
      generatedClasses.StudentOuterClass.Student> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStudent",
      requestType = generatedClasses.StudentOuterClass.Student.class,
      responseType = generatedClasses.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student,
      generatedClasses.StudentOuterClass.Student> getAddStudentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student, generatedClasses.StudentOuterClass.Student> getAddStudentMethod;
    if ((getAddStudentMethod = StudentServiceGrpc.getAddStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getAddStudentMethod = StudentServiceGrpc.getAddStudentMethod) == null) {
          StudentServiceGrpc.getAddStudentMethod = getAddStudentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.Student, generatedClasses.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.Student.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("AddStudent"))
              .build();
        }
      }
    }
    return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest,
      generatedClasses.StudentOuterClass.Student> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = generatedClasses.StudentOuterClass.StudentRequest.class,
      responseType = generatedClasses.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest,
      generatedClasses.StudentOuterClass.Student> getGetStudentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest, generatedClasses.StudentOuterClass.Student> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
          StudentServiceGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.StudentRequest, generatedClasses.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1,
      generatedClasses.StudentOuterClass.StudentsResponse> getGetAllStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStudents",
      requestType = generatedClasses.StudentOuterClass.EmptyRequest1.class,
      responseType = generatedClasses.StudentOuterClass.StudentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1,
      generatedClasses.StudentOuterClass.StudentsResponse> getGetAllStudentsMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1, generatedClasses.StudentOuterClass.StudentsResponse> getGetAllStudentsMethod;
    if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
          StudentServiceGrpc.getGetAllStudentsMethod = getGetAllStudentsMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.EmptyRequest1, generatedClasses.StudentOuterClass.StudentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.EmptyRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.StudentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetAllStudents"))
              .build();
        }
      }
    }
    return getGetAllStudentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest,
      generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStudent",
      requestType = generatedClasses.StudentOuterClass.StudentRequest.class,
      responseType = generatedClasses.StudentOuterClass.EmptyResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest,
      generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.StudentRequest, generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
          StudentServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.StudentRequest, generatedClasses.StudentOuterClass.EmptyResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.EmptyResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("DeleteStudent"))
              .build();
        }
      }
    }
    return getDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student,
      generatedClasses.StudentOuterClass.Student> getUpdateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStudent",
      requestType = generatedClasses.StudentOuterClass.Student.class,
      responseType = generatedClasses.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student,
      generatedClasses.StudentOuterClass.Student> getUpdateStudentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.Student, generatedClasses.StudentOuterClass.Student> getUpdateStudentMethod;
    if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
          StudentServiceGrpc.getUpdateStudentMethod = getUpdateStudentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.Student, generatedClasses.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.Student.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("UpdateStudent"))
              .build();
        }
      }
    }
    return getUpdateStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub>() {
        @java.lang.Override
        public StudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceStub(channel, callOptions);
        }
      };
    return StudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub>() {
        @java.lang.Override
        public StudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub>() {
        @java.lang.Override
        public StudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceFutureStub(channel, callOptions);
        }
      };
    return StudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addStudent(generatedClasses.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    default void getStudent(generatedClasses.StudentOuterClass.StudentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    default void getAllStudents(generatedClasses.StudentOuterClass.EmptyRequest1 request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStudentsMethod(), responseObserver);
    }

    /**
     */
    default void deleteStudent(generatedClasses.StudentOuterClass.StudentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    default void updateStudent(generatedClasses.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStudentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentService.
   */
  public static abstract class StudentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentServiceStub> {
    private StudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void addStudent(generatedClasses.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudent(generatedClasses.StudentOuterClass.StudentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStudents(generatedClasses.StudentOuterClass.EmptyRequest1 request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllStudentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(generatedClasses.StudentOuterClass.StudentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStudent(generatedClasses.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedClasses.StudentOuterClass.Student addStudent(generatedClasses.StudentOuterClass.Student request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.StudentOuterClass.Student getStudent(generatedClasses.StudentOuterClass.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedClasses.StudentOuterClass.StudentsResponse> getAllStudents(
        generatedClasses.StudentOuterClass.EmptyRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllStudentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.StudentOuterClass.EmptyResponse1 deleteStudent(generatedClasses.StudentOuterClass.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.StudentOuterClass.Student updateStudent(generatedClasses.StudentOuterClass.Student request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentService.
   */
  public static final class StudentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.StudentOuterClass.Student> addStudent(
        generatedClasses.StudentOuterClass.Student request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.StudentOuterClass.Student> getStudent(
        generatedClasses.StudentOuterClass.StudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.StudentOuterClass.EmptyResponse1> deleteStudent(
        generatedClasses.StudentOuterClass.StudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.StudentOuterClass.Student> updateStudent(
        generatedClasses.StudentOuterClass.Student request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STUDENT = 0;
  private static final int METHODID_GET_STUDENT = 1;
  private static final int METHODID_GET_ALL_STUDENTS = 2;
  private static final int METHODID_DELETE_STUDENT = 3;
  private static final int METHODID_UPDATE_STUDENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_STUDENT:
          serviceImpl.addStudent((generatedClasses.StudentOuterClass.Student) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((generatedClasses.StudentOuterClass.StudentRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_GET_ALL_STUDENTS:
          serviceImpl.getAllStudents((generatedClasses.StudentOuterClass.EmptyRequest1) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((generatedClasses.StudentOuterClass.StudentRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((generatedClasses.StudentOuterClass.Student) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.Student>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.Student,
              generatedClasses.StudentOuterClass.Student>(
                service, METHODID_ADD_STUDENT)))
        .addMethod(
          getGetStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.StudentRequest,
              generatedClasses.StudentOuterClass.Student>(
                service, METHODID_GET_STUDENT)))
        .addMethod(
          getGetAllStudentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.EmptyRequest1,
              generatedClasses.StudentOuterClass.StudentsResponse>(
                service, METHODID_GET_ALL_STUDENTS)))
        .addMethod(
          getDeleteStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.StudentRequest,
              generatedClasses.StudentOuterClass.EmptyResponse1>(
                service, METHODID_DELETE_STUDENT)))
        .addMethod(
          getUpdateStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.Student,
              generatedClasses.StudentOuterClass.Student>(
                service, METHODID_UPDATE_STUDENT)))
        .build();
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedClasses.StudentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StudentServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getAddStudentMethod())
              .addMethod(getGetStudentMethod())
              .addMethod(getGetAllStudentsMethod())
              .addMethod(getDeleteStudentMethod())
              .addMethod(getUpdateStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
