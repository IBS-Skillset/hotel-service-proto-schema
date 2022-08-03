package com.hotel.service.availability;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: com/hotel/service/availability/hotel_availability.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final String SERVICE_NAME = "com.hotel.service.availability.HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hotel.service.availability.HotelAvailabilityRequest,
      com.hotel.service.availability.HotelAvailabilityResponse> getGetHotelItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHotelItem",
      requestType = com.hotel.service.availability.HotelAvailabilityRequest.class,
      responseType = com.hotel.service.availability.HotelAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.service.availability.HotelAvailabilityRequest,
      com.hotel.service.availability.HotelAvailabilityResponse> getGetHotelItemMethod() {
    io.grpc.MethodDescriptor<com.hotel.service.availability.HotelAvailabilityRequest, com.hotel.service.availability.HotelAvailabilityResponse> getGetHotelItemMethod;
    if ((getGetHotelItemMethod = HotelServiceGrpc.getGetHotelItemMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetHotelItemMethod = HotelServiceGrpc.getGetHotelItemMethod) == null) {
          HotelServiceGrpc.getGetHotelItemMethod = getGetHotelItemMethod =
              io.grpc.MethodDescriptor.<com.hotel.service.availability.HotelAvailabilityRequest, com.hotel.service.availability.HotelAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHotelItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.service.availability.HotelAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.service.availability.HotelAvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("getHotelItem"))
              .build();
        }
      }
    }
    return getGetHotelItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub>() {
        @java.lang.Override
        public HotelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceStub(channel, callOptions);
        }
      };
    return HotelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub>() {
        @java.lang.Override
        public HotelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub>() {
        @java.lang.Override
        public HotelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceFutureStub(channel, callOptions);
        }
      };
    return HotelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HotelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHotelItem(com.hotel.service.availability.HotelAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.hotel.service.availability.HotelAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHotelItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.hotel.service.availability.HotelAvailabilityRequest,
                com.hotel.service.availability.HotelAvailabilityResponse>(
                  this, METHODID_GET_HOTEL_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceStub extends io.grpc.stub.AbstractAsyncStub<HotelServiceStub> {
    private HotelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHotelItem(com.hotel.service.availability.HotelAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.hotel.service.availability.HotelAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hotel.service.availability.HotelAvailabilityResponse getHotelItem(com.hotel.service.availability.HotelAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.service.availability.HotelAvailabilityResponse> getHotelItem(
        com.hotel.service.availability.HotelAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOTEL_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOTEL_ITEM:
          serviceImpl.getHotelItem((com.hotel.service.availability.HotelAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.service.availability.HotelAvailabilityResponse>) responseObserver);
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

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hotel.service.availability.HotelItems.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getGetHotelItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
