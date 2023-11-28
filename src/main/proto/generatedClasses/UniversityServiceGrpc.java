package generatedClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: university.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UniversityServiceGrpc {

  private UniversityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.UniversityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University,
      generatedClasses.UniversityOuterClass.University> getAddUniversityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUniversity",
      requestType = generatedClasses.UniversityOuterClass.University.class,
      responseType = generatedClasses.UniversityOuterClass.University.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University,
      generatedClasses.UniversityOuterClass.University> getAddUniversityMethod() {
    io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University, generatedClasses.UniversityOuterClass.University> getAddUniversityMethod;
    if ((getAddUniversityMethod = UniversityServiceGrpc.getAddUniversityMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getAddUniversityMethod = UniversityServiceGrpc.getAddUniversityMethod) == null) {
          UniversityServiceGrpc.getAddUniversityMethod = getAddUniversityMethod =
              io.grpc.MethodDescriptor.<generatedClasses.UniversityOuterClass.University, generatedClasses.UniversityOuterClass.University>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUniversity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.University.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.University.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("AddUniversity"))
              .build();
        }
      }
    }
    return getAddUniversityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.UniversityOuterClass.University> getGetUniversityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUniversity",
      requestType = generatedClasses.UniversityOuterClass.UniversityRequest.class,
      responseType = generatedClasses.UniversityOuterClass.University.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.UniversityOuterClass.University> getGetUniversityMethod() {
    io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.UniversityOuterClass.University> getGetUniversityMethod;
    if ((getGetUniversityMethod = UniversityServiceGrpc.getGetUniversityMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetUniversityMethod = UniversityServiceGrpc.getGetUniversityMethod) == null) {
          UniversityServiceGrpc.getGetUniversityMethod = getGetUniversityMethod =
              io.grpc.MethodDescriptor.<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.UniversityOuterClass.University>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUniversity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.UniversityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.University.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetUniversity"))
              .build();
        }
      }
    }
    return getGetUniversityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1,
      generatedClasses.UniversityOuterClass.UniversitiesResponse> getGetAllUniversitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUniversities",
      requestType = generatedClasses.StudentOuterClass.EmptyRequest1.class,
      responseType = generatedClasses.UniversityOuterClass.UniversitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1,
      generatedClasses.UniversityOuterClass.UniversitiesResponse> getGetAllUniversitiesMethod() {
    io.grpc.MethodDescriptor<generatedClasses.StudentOuterClass.EmptyRequest1, generatedClasses.UniversityOuterClass.UniversitiesResponse> getGetAllUniversitiesMethod;
    if ((getGetAllUniversitiesMethod = UniversityServiceGrpc.getGetAllUniversitiesMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetAllUniversitiesMethod = UniversityServiceGrpc.getGetAllUniversitiesMethod) == null) {
          UniversityServiceGrpc.getGetAllUniversitiesMethod = getGetAllUniversitiesMethod =
              io.grpc.MethodDescriptor.<generatedClasses.StudentOuterClass.EmptyRequest1, generatedClasses.UniversityOuterClass.UniversitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUniversities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.EmptyRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.UniversitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetAllUniversities"))
              .build();
        }
      }
    }
    return getGetAllUniversitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University,
      generatedClasses.UniversityOuterClass.University> getUpdateUniversityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUniversity",
      requestType = generatedClasses.UniversityOuterClass.University.class,
      responseType = generatedClasses.UniversityOuterClass.University.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University,
      generatedClasses.UniversityOuterClass.University> getUpdateUniversityMethod() {
    io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.University, generatedClasses.UniversityOuterClass.University> getUpdateUniversityMethod;
    if ((getUpdateUniversityMethod = UniversityServiceGrpc.getUpdateUniversityMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getUpdateUniversityMethod = UniversityServiceGrpc.getUpdateUniversityMethod) == null) {
          UniversityServiceGrpc.getUpdateUniversityMethod = getUpdateUniversityMethod =
              io.grpc.MethodDescriptor.<generatedClasses.UniversityOuterClass.University, generatedClasses.UniversityOuterClass.University>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUniversity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.University.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.University.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("UpdateUniversity"))
              .build();
        }
      }
    }
    return getUpdateUniversityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteUniversityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUniversity",
      requestType = generatedClasses.UniversityOuterClass.UniversityRequest.class,
      responseType = generatedClasses.StudentOuterClass.EmptyResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteUniversityMethod() {
    io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.StudentOuterClass.EmptyResponse1> getDeleteUniversityMethod;
    if ((getDeleteUniversityMethod = UniversityServiceGrpc.getDeleteUniversityMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getDeleteUniversityMethod = UniversityServiceGrpc.getDeleteUniversityMethod) == null) {
          UniversityServiceGrpc.getDeleteUniversityMethod = getDeleteUniversityMethod =
              io.grpc.MethodDescriptor.<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.StudentOuterClass.EmptyResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUniversity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.UniversityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.EmptyResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("DeleteUniversity"))
              .build();
        }
      }
    }
    return getDeleteUniversityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.StudentOuterClass.StudentsResponse> getGetStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudents",
      requestType = generatedClasses.UniversityOuterClass.UniversityRequest.class,
      responseType = generatedClasses.StudentOuterClass.StudentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest,
      generatedClasses.StudentOuterClass.StudentsResponse> getGetStudentsMethod() {
    io.grpc.MethodDescriptor<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.StudentOuterClass.StudentsResponse> getGetStudentsMethod;
    if ((getGetStudentsMethod = UniversityServiceGrpc.getGetStudentsMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetStudentsMethod = UniversityServiceGrpc.getGetStudentsMethod) == null) {
          UniversityServiceGrpc.getGetStudentsMethod = getGetStudentsMethod =
              io.grpc.MethodDescriptor.<generatedClasses.UniversityOuterClass.UniversityRequest, generatedClasses.StudentOuterClass.StudentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.UniversityOuterClass.UniversityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.StudentOuterClass.StudentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetStudents"))
              .build();
        }
      }
    }
    return getGetStudentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UniversityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceStub>() {
        @java.lang.Override
        public UniversityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceStub(channel, callOptions);
        }
      };
    return UniversityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UniversityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceBlockingStub>() {
        @java.lang.Override
        public UniversityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceBlockingStub(channel, callOptions);
        }
      };
    return UniversityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UniversityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceFutureStub>() {
        @java.lang.Override
        public UniversityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceFutureStub(channel, callOptions);
        }
      };
    return UniversityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addUniversity(generatedClasses.UniversityOuterClass.University request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUniversityMethod(), responseObserver);
    }

    /**
     */
    default void getUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUniversityMethod(), responseObserver);
    }

    /**
     */
    default void getAllUniversities(generatedClasses.StudentOuterClass.EmptyRequest1 request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.UniversitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUniversitiesMethod(), responseObserver);
    }

    /**
     */
    default void updateUniversity(generatedClasses.UniversityOuterClass.University request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUniversityMethod(), responseObserver);
    }

    /**
     */
    default void deleteUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUniversityMethod(), responseObserver);
    }

    /**
     */
    default void getStudents(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UniversityService.
   */
  public static abstract class UniversityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UniversityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UniversityService.
   */
  public static final class UniversityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UniversityServiceStub> {
    private UniversityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUniversity(generatedClasses.UniversityOuterClass.University request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUniversityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUniversityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUniversities(generatedClasses.StudentOuterClass.EmptyRequest1 request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.UniversitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllUniversitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUniversity(generatedClasses.UniversityOuterClass.University request,
        io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUniversityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUniversityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudents(generatedClasses.UniversityOuterClass.UniversityRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStudentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UniversityService.
   */
  public static final class UniversityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UniversityServiceBlockingStub> {
    private UniversityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedClasses.UniversityOuterClass.University addUniversity(generatedClasses.UniversityOuterClass.University request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUniversityMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.UniversityOuterClass.University getUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUniversityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedClasses.UniversityOuterClass.UniversitiesResponse> getAllUniversities(
        generatedClasses.StudentOuterClass.EmptyRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllUniversitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.UniversityOuterClass.University updateUniversity(generatedClasses.UniversityOuterClass.University request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUniversityMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.StudentOuterClass.EmptyResponse1 deleteUniversity(generatedClasses.UniversityOuterClass.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUniversityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedClasses.StudentOuterClass.StudentsResponse> getStudents(
        generatedClasses.UniversityOuterClass.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStudentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UniversityService.
   */
  public static final class UniversityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UniversityServiceFutureStub> {
    private UniversityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.UniversityOuterClass.University> addUniversity(
        generatedClasses.UniversityOuterClass.University request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUniversityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.UniversityOuterClass.University> getUniversity(
        generatedClasses.UniversityOuterClass.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUniversityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.UniversityOuterClass.University> updateUniversity(
        generatedClasses.UniversityOuterClass.University request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUniversityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.StudentOuterClass.EmptyResponse1> deleteUniversity(
        generatedClasses.UniversityOuterClass.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUniversityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_UNIVERSITY = 0;
  private static final int METHODID_GET_UNIVERSITY = 1;
  private static final int METHODID_GET_ALL_UNIVERSITIES = 2;
  private static final int METHODID_UPDATE_UNIVERSITY = 3;
  private static final int METHODID_DELETE_UNIVERSITY = 4;
  private static final int METHODID_GET_STUDENTS = 5;

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
        case METHODID_ADD_UNIVERSITY:
          serviceImpl.addUniversity((generatedClasses.UniversityOuterClass.University) request,
              (io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University>) responseObserver);
          break;
        case METHODID_GET_UNIVERSITY:
          serviceImpl.getUniversity((generatedClasses.UniversityOuterClass.UniversityRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University>) responseObserver);
          break;
        case METHODID_GET_ALL_UNIVERSITIES:
          serviceImpl.getAllUniversities((generatedClasses.StudentOuterClass.EmptyRequest1) request,
              (io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.UniversitiesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_UNIVERSITY:
          serviceImpl.updateUniversity((generatedClasses.UniversityOuterClass.University) request,
              (io.grpc.stub.StreamObserver<generatedClasses.UniversityOuterClass.University>) responseObserver);
          break;
        case METHODID_DELETE_UNIVERSITY:
          serviceImpl.deleteUniversity((generatedClasses.UniversityOuterClass.UniversityRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.EmptyResponse1>) responseObserver);
          break;
        case METHODID_GET_STUDENTS:
          serviceImpl.getStudents((generatedClasses.UniversityOuterClass.UniversityRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.StudentOuterClass.StudentsResponse>) responseObserver);
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
          getAddUniversityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.UniversityOuterClass.University,
              generatedClasses.UniversityOuterClass.University>(
                service, METHODID_ADD_UNIVERSITY)))
        .addMethod(
          getGetUniversityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.UniversityOuterClass.UniversityRequest,
              generatedClasses.UniversityOuterClass.University>(
                service, METHODID_GET_UNIVERSITY)))
        .addMethod(
          getGetAllUniversitiesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generatedClasses.StudentOuterClass.EmptyRequest1,
              generatedClasses.UniversityOuterClass.UniversitiesResponse>(
                service, METHODID_GET_ALL_UNIVERSITIES)))
        .addMethod(
          getUpdateUniversityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.UniversityOuterClass.University,
              generatedClasses.UniversityOuterClass.University>(
                service, METHODID_UPDATE_UNIVERSITY)))
        .addMethod(
          getDeleteUniversityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.UniversityOuterClass.UniversityRequest,
              generatedClasses.StudentOuterClass.EmptyResponse1>(
                service, METHODID_DELETE_UNIVERSITY)))
        .addMethod(
          getGetStudentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generatedClasses.UniversityOuterClass.UniversityRequest,
              generatedClasses.StudentOuterClass.StudentsResponse>(
                service, METHODID_GET_STUDENTS)))
        .build();
  }

  private static abstract class UniversityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UniversityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedClasses.UniversityOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UniversityService");
    }
  }

  private static final class UniversityServiceFileDescriptorSupplier
      extends UniversityServiceBaseDescriptorSupplier {
    UniversityServiceFileDescriptorSupplier() {}
  }

  private static final class UniversityServiceMethodDescriptorSupplier
      extends UniversityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UniversityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UniversityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UniversityServiceFileDescriptorSupplier())
              .addMethod(getAddUniversityMethod())
              .addMethod(getGetUniversityMethod())
              .addMethod(getGetAllUniversitiesMethod())
              .addMethod(getUpdateUniversityMethod())
              .addMethod(getDeleteUniversityMethod())
              .addMethod(getGetStudentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
