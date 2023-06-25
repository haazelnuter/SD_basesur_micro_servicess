package com.example.radarservice.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: gRPC.proto")
public final class DepassementVitesseServiceGrpc {

  private DepassementVitesseServiceGrpc() {}

  public static final String SERVICE_NAME = "DepassementVitesseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.radarservice.grpc.stubs.GRPC.DepassementRequest,
      com.example.radarservice.grpc.stubs.GRPC.depassementResponse> getDepasseVitsseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "depasseVitsse",
      requestType = com.example.radarservice.grpc.stubs.GRPC.DepassementRequest.class,
      responseType = com.example.radarservice.grpc.stubs.GRPC.depassementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.radarservice.grpc.stubs.GRPC.DepassementRequest,
      com.example.radarservice.grpc.stubs.GRPC.depassementResponse> getDepasseVitsseMethod() {
    io.grpc.MethodDescriptor<com.example.radarservice.grpc.stubs.GRPC.DepassementRequest, com.example.radarservice.grpc.stubs.GRPC.depassementResponse> getDepasseVitsseMethod;
    if ((getDepasseVitsseMethod = DepassementVitesseServiceGrpc.getDepasseVitsseMethod) == null) {
      synchronized (DepassementVitesseServiceGrpc.class) {
        if ((getDepasseVitsseMethod = DepassementVitesseServiceGrpc.getDepasseVitsseMethod) == null) {
          DepassementVitesseServiceGrpc.getDepasseVitsseMethod = getDepasseVitsseMethod = 
              io.grpc.MethodDescriptor.<com.example.radarservice.grpc.stubs.GRPC.DepassementRequest, com.example.radarservice.grpc.stubs.GRPC.depassementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepassementVitesseService", "depasseVitsse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.radarservice.grpc.stubs.GRPC.DepassementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.radarservice.grpc.stubs.GRPC.depassementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepassementVitesseServiceMethodDescriptorSupplier("depasseVitsse"))
                  .build();
          }
        }
     }
     return getDepasseVitsseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.radarservice.grpc.stubs.GRPC.RadarResponse> getGetRadarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRadars",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.radarservice.grpc.stubs.GRPC.RadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.radarservice.grpc.stubs.GRPC.RadarResponse> getGetRadarsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.radarservice.grpc.stubs.GRPC.RadarResponse> getGetRadarsMethod;
    if ((getGetRadarsMethod = DepassementVitesseServiceGrpc.getGetRadarsMethod) == null) {
      synchronized (DepassementVitesseServiceGrpc.class) {
        if ((getGetRadarsMethod = DepassementVitesseServiceGrpc.getGetRadarsMethod) == null) {
          DepassementVitesseServiceGrpc.getGetRadarsMethod = getGetRadarsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.radarservice.grpc.stubs.GRPC.RadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "DepassementVitesseService", "getRadars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.radarservice.grpc.stubs.GRPC.RadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepassementVitesseServiceMethodDescriptorSupplier("getRadars"))
                  .build();
          }
        }
     }
     return getGetRadarsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepassementVitesseServiceStub newStub(io.grpc.Channel channel) {
    return new DepassementVitesseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepassementVitesseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepassementVitesseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepassementVitesseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepassementVitesseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepassementVitesseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void depasseVitsse(com.example.radarservice.grpc.stubs.GRPC.DepassementRequest request,
        io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.depassementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepasseVitsseMethod(), responseObserver);
    }

    /**
     */
    public void getRadars(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.RadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepasseVitsseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.radarservice.grpc.stubs.GRPC.DepassementRequest,
                com.example.radarservice.grpc.stubs.GRPC.depassementResponse>(
                  this, METHODID_DEPASSE_VITSSE)))
          .addMethod(
            getGetRadarsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.radarservice.grpc.stubs.GRPC.RadarResponse>(
                  this, METHODID_GET_RADARS)))
          .build();
    }
  }

  /**
   */
  public static final class DepassementVitesseServiceStub extends io.grpc.stub.AbstractStub<DepassementVitesseServiceStub> {
    private DepassementVitesseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepassementVitesseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepassementVitesseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepassementVitesseServiceStub(channel, callOptions);
    }

    /**
     */
    public void depasseVitsse(com.example.radarservice.grpc.stubs.GRPC.DepassementRequest request,
        io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.depassementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepasseVitsseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRadars(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.RadarResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRadarsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepassementVitesseServiceBlockingStub extends io.grpc.stub.AbstractStub<DepassementVitesseServiceBlockingStub> {
    private DepassementVitesseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepassementVitesseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepassementVitesseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepassementVitesseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.radarservice.grpc.stubs.GRPC.depassementResponse depasseVitsse(com.example.radarservice.grpc.stubs.GRPC.DepassementRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepasseVitsseMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.radarservice.grpc.stubs.GRPC.RadarResponse> getRadars(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRadarsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepassementVitesseServiceFutureStub extends io.grpc.stub.AbstractStub<DepassementVitesseServiceFutureStub> {
    private DepassementVitesseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepassementVitesseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepassementVitesseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepassementVitesseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.radarservice.grpc.stubs.GRPC.depassementResponse> depasseVitsse(
        com.example.radarservice.grpc.stubs.GRPC.DepassementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepasseVitsseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPASSE_VITSSE = 0;
  private static final int METHODID_GET_RADARS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepassementVitesseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepassementVitesseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPASSE_VITSSE:
          serviceImpl.depasseVitsse((com.example.radarservice.grpc.stubs.GRPC.DepassementRequest) request,
              (io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.depassementResponse>) responseObserver);
          break;
        case METHODID_GET_RADARS:
          serviceImpl.getRadars((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.radarservice.grpc.stubs.GRPC.RadarResponse>) responseObserver);
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

  private static abstract class DepassementVitesseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepassementVitesseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.radarservice.grpc.stubs.GRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepassementVitesseService");
    }
  }

  private static final class DepassementVitesseServiceFileDescriptorSupplier
      extends DepassementVitesseServiceBaseDescriptorSupplier {
    DepassementVitesseServiceFileDescriptorSupplier() {}
  }

  private static final class DepassementVitesseServiceMethodDescriptorSupplier
      extends DepassementVitesseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepassementVitesseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepassementVitesseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepassementVitesseServiceFileDescriptorSupplier())
              .addMethod(getDepasseVitsseMethod())
              .addMethod(getGetRadarsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
