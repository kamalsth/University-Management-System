package generatedClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: department.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department,
      generatedClasses.DepartmentOuterClass.Department> getAddDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDepartment",
      requestType = generatedClasses.DepartmentOuterClass.Department.class,
      responseType = generatedClasses.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department,
      generatedClasses.DepartmentOuterClass.Department> getAddDepartmentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department, generatedClasses.DepartmentOuterClass.Department> getAddDepartmentMethod;
    if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getAddDepartmentMethod = DepartmentServiceGrpc.getAddDepartmentMethod) == null) {
          DepartmentServiceGrpc.getAddDepartmentMethod = getAddDepartmentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.DepartmentOuterClass.Department, generatedClasses.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("AddDepartment"))
              .build();
        }
      }
    }
    return getAddDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest,
      generatedClasses.DepartmentOuterClass.Department> getGetDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepartment",
      requestType = generatedClasses.DepartmentOuterClass.DepartmentRequest.class,
      responseType = generatedClasses.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest,
      generatedClasses.DepartmentOuterClass.Department> getGetDepartmentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest, generatedClasses.DepartmentOuterClass.Department> getGetDepartmentMethod;
    if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getGetDepartmentMethod = DepartmentServiceGrpc.getGetDepartmentMethod) == null) {
          DepartmentServiceGrpc.getGetDepartmentMethod = getGetDepartmentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.DepartmentOuterClass.DepartmentRequest, generatedClasses.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("GetDepartment"))
              .build();
        }
      }
    }
    return getGetDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.EmptyRequest2,
      generatedClasses.DepartmentOuterClass.DepartmentsResponse> getGetAllDepartmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllDepartments",
      requestType = generatedClasses.DepartmentOuterClass.EmptyRequest2.class,
      responseType = generatedClasses.DepartmentOuterClass.DepartmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.EmptyRequest2,
      generatedClasses.DepartmentOuterClass.DepartmentsResponse> getGetAllDepartmentsMethod() {
    io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.EmptyRequest2, generatedClasses.DepartmentOuterClass.DepartmentsResponse> getGetAllDepartmentsMethod;
    if ((getGetAllDepartmentsMethod = DepartmentServiceGrpc.getGetAllDepartmentsMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getGetAllDepartmentsMethod = DepartmentServiceGrpc.getGetAllDepartmentsMethod) == null) {
          DepartmentServiceGrpc.getGetAllDepartmentsMethod = getGetAllDepartmentsMethod =
              io.grpc.MethodDescriptor.<generatedClasses.DepartmentOuterClass.EmptyRequest2, generatedClasses.DepartmentOuterClass.DepartmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllDepartments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.EmptyRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.DepartmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("GetAllDepartments"))
              .build();
        }
      }
    }
    return getGetAllDepartmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest,
      generatedClasses.DepartmentOuterClass.EmptyResponse2> getDeleteDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDepartment",
      requestType = generatedClasses.DepartmentOuterClass.DepartmentRequest.class,
      responseType = generatedClasses.DepartmentOuterClass.EmptyResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest,
      generatedClasses.DepartmentOuterClass.EmptyResponse2> getDeleteDepartmentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.DepartmentRequest, generatedClasses.DepartmentOuterClass.EmptyResponse2> getDeleteDepartmentMethod;
    if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getDeleteDepartmentMethod = DepartmentServiceGrpc.getDeleteDepartmentMethod) == null) {
          DepartmentServiceGrpc.getDeleteDepartmentMethod = getDeleteDepartmentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.DepartmentOuterClass.DepartmentRequest, generatedClasses.DepartmentOuterClass.EmptyResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.DepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.EmptyResponse2.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("DeleteDepartment"))
              .build();
        }
      }
    }
    return getDeleteDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department,
      generatedClasses.DepartmentOuterClass.Department> getUpdateDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDepartment",
      requestType = generatedClasses.DepartmentOuterClass.Department.class,
      responseType = generatedClasses.DepartmentOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department,
      generatedClasses.DepartmentOuterClass.Department> getUpdateDepartmentMethod() {
    io.grpc.MethodDescriptor<generatedClasses.DepartmentOuterClass.Department, generatedClasses.DepartmentOuterClass.Department> getUpdateDepartmentMethod;
    if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getUpdateDepartmentMethod = DepartmentServiceGrpc.getUpdateDepartmentMethod) == null) {
          DepartmentServiceGrpc.getUpdateDepartmentMethod = getUpdateDepartmentMethod =
              io.grpc.MethodDescriptor.<generatedClasses.DepartmentOuterClass.Department, generatedClasses.DepartmentOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.Department.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generatedClasses.DepartmentOuterClass.Department.getDefaultInstance()))
              .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("UpdateDepartment"))
              .build();
        }
      }
    }
    return getUpdateDepartmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceStub>() {
        @java.lang.Override
        public DepartmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceStub(channel, callOptions);
        }
      };
    return DepartmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceBlockingStub>() {
        @java.lang.Override
        public DepartmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceBlockingStub(channel, callOptions);
        }
      };
    return DepartmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepartmentServiceFutureStub>() {
        @java.lang.Override
        public DepartmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepartmentServiceFutureStub(channel, callOptions);
        }
      };
    return DepartmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addDepartment(generatedClasses.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void getDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void getAllDepartments(generatedClasses.DepartmentOuterClass.EmptyRequest2 request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.DepartmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllDepartmentsMethod(), responseObserver);
    }

    /**
     */
    default void deleteDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.EmptyResponse2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDepartmentMethod(), responseObserver);
    }

    /**
     */
    default void updateDepartment(generatedClasses.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDepartmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DepartmentService.
   */
  public static abstract class DepartmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DepartmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DepartmentServiceStub> {
    private DepartmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void addDepartment(generatedClasses.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllDepartments(generatedClasses.DepartmentOuterClass.EmptyRequest2 request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.DepartmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllDepartmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.EmptyResponse2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDepartment(generatedClasses.DepartmentOuterClass.Department request,
        io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generatedClasses.DepartmentOuterClass.Department addDepartment(generatedClasses.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.DepartmentOuterClass.Department getDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generatedClasses.DepartmentOuterClass.DepartmentsResponse> getAllDepartments(
        generatedClasses.DepartmentOuterClass.EmptyRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllDepartmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.DepartmentOuterClass.EmptyResponse2 deleteDepartment(generatedClasses.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public generatedClasses.DepartmentOuterClass.Department updateDepartment(generatedClasses.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDepartmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DepartmentService.
   */
  public static final class DepartmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.DepartmentOuterClass.Department> addDepartment(
        generatedClasses.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.DepartmentOuterClass.Department> getDepartment(
        generatedClasses.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.DepartmentOuterClass.EmptyResponse2> deleteDepartment(
        generatedClasses.DepartmentOuterClass.DepartmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generatedClasses.DepartmentOuterClass.Department> updateDepartment(
        generatedClasses.DepartmentOuterClass.Department request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDepartmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DEPARTMENT = 0;
  private static final int METHODID_GET_DEPARTMENT = 1;
  private static final int METHODID_GET_ALL_DEPARTMENTS = 2;
  private static final int METHODID_DELETE_DEPARTMENT = 3;
  private static final int METHODID_UPDATE_DEPARTMENT = 4;

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
        case METHODID_ADD_DEPARTMENT:
          serviceImpl.addDepartment((generatedClasses.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department>) responseObserver);
          break;
        case METHODID_GET_DEPARTMENT:
          serviceImpl.getDepartment((generatedClasses.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department>) responseObserver);
          break;
        case METHODID_GET_ALL_DEPARTMENTS:
          serviceImpl.getAllDepartments((generatedClasses.DepartmentOuterClass.EmptyRequest2) request,
              (io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.DepartmentsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEPARTMENT:
          serviceImpl.deleteDepartment((generatedClasses.DepartmentOuterClass.DepartmentRequest) request,
              (io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.EmptyResponse2>) responseObserver);
          break;
        case METHODID_UPDATE_DEPARTMENT:
          serviceImpl.updateDepartment((generatedClasses.DepartmentOuterClass.Department) request,
              (io.grpc.stub.StreamObserver<generatedClasses.DepartmentOuterClass.Department>) responseObserver);
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
          getAddDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.DepartmentOuterClass.Department,
              generatedClasses.DepartmentOuterClass.Department>(
                service, METHODID_ADD_DEPARTMENT)))
        .addMethod(
          getGetDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.DepartmentOuterClass.DepartmentRequest,
              generatedClasses.DepartmentOuterClass.Department>(
                service, METHODID_GET_DEPARTMENT)))
        .addMethod(
          getGetAllDepartmentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generatedClasses.DepartmentOuterClass.EmptyRequest2,
              generatedClasses.DepartmentOuterClass.DepartmentsResponse>(
                service, METHODID_GET_ALL_DEPARTMENTS)))
        .addMethod(
          getDeleteDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.DepartmentOuterClass.DepartmentRequest,
              generatedClasses.DepartmentOuterClass.EmptyResponse2>(
                service, METHODID_DELETE_DEPARTMENT)))
        .addMethod(
          getUpdateDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generatedClasses.DepartmentOuterClass.Department,
              generatedClasses.DepartmentOuterClass.Department>(
                service, METHODID_UPDATE_DEPARTMENT)))
        .build();
  }

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generatedClasses.DepartmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartmentService");
    }
  }

  private static final class DepartmentServiceFileDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier {
    DepartmentServiceFileDescriptorSupplier() {}
  }

  private static final class DepartmentServiceMethodDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DepartmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceFileDescriptorSupplier())
              .addMethod(getAddDepartmentMethod())
              .addMethod(getGetDepartmentMethod())
              .addMethod(getGetAllDepartmentsMethod())
              .addMethod(getDeleteDepartmentMethod())
              .addMethod(getUpdateDepartmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
