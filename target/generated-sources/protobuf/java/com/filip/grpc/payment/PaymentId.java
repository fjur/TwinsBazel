// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package com.filip.grpc.payment;

/**
 * Protobuf type {@code grpc.payment.PaymentId}
 */
public  final class PaymentId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.payment.PaymentId)
    PaymentIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentId.newBuilder() to construct.
  private PaymentId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentId() {
    paymentId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaymentId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            paymentId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.filip.grpc.payment.PaymentProto.internal_static_grpc_payment_PaymentId_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.filip.grpc.payment.PaymentProto.internal_static_grpc_payment_PaymentId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.filip.grpc.payment.PaymentId.class, com.filip.grpc.payment.PaymentId.Builder.class);
  }

  public static final int PAYMENTID_FIELD_NUMBER = 1;
  private int paymentId_;
  /**
   * <code>int32 paymentId = 1;</code>
   */
  public int getPaymentId() {
    return paymentId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (paymentId_ != 0) {
      output.writeInt32(1, paymentId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (paymentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, paymentId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.filip.grpc.payment.PaymentId)) {
      return super.equals(obj);
    }
    com.filip.grpc.payment.PaymentId other = (com.filip.grpc.payment.PaymentId) obj;

    boolean result = true;
    result = result && (getPaymentId()
        == other.getPaymentId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAYMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.filip.grpc.payment.PaymentId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.filip.grpc.payment.PaymentId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.filip.grpc.payment.PaymentId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.filip.grpc.payment.PaymentId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.filip.grpc.payment.PaymentId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.payment.PaymentId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.payment.PaymentId)
      com.filip.grpc.payment.PaymentIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.filip.grpc.payment.PaymentProto.internal_static_grpc_payment_PaymentId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.filip.grpc.payment.PaymentProto.internal_static_grpc_payment_PaymentId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.filip.grpc.payment.PaymentId.class, com.filip.grpc.payment.PaymentId.Builder.class);
    }

    // Construct using com.filip.grpc.payment.PaymentId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      paymentId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.filip.grpc.payment.PaymentProto.internal_static_grpc_payment_PaymentId_descriptor;
    }

    public com.filip.grpc.payment.PaymentId getDefaultInstanceForType() {
      return com.filip.grpc.payment.PaymentId.getDefaultInstance();
    }

    public com.filip.grpc.payment.PaymentId build() {
      com.filip.grpc.payment.PaymentId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.filip.grpc.payment.PaymentId buildPartial() {
      com.filip.grpc.payment.PaymentId result = new com.filip.grpc.payment.PaymentId(this);
      result.paymentId_ = paymentId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.filip.grpc.payment.PaymentId) {
        return mergeFrom((com.filip.grpc.payment.PaymentId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.filip.grpc.payment.PaymentId other) {
      if (other == com.filip.grpc.payment.PaymentId.getDefaultInstance()) return this;
      if (other.getPaymentId() != 0) {
        setPaymentId(other.getPaymentId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.filip.grpc.payment.PaymentId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.filip.grpc.payment.PaymentId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int paymentId_ ;
    /**
     * <code>int32 paymentId = 1;</code>
     */
    public int getPaymentId() {
      return paymentId_;
    }
    /**
     * <code>int32 paymentId = 1;</code>
     */
    public Builder setPaymentId(int value) {
      
      paymentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 paymentId = 1;</code>
     */
    public Builder clearPaymentId() {
      
      paymentId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.payment.PaymentId)
  }

  // @@protoc_insertion_point(class_scope:grpc.payment.PaymentId)
  private static final com.filip.grpc.payment.PaymentId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.filip.grpc.payment.PaymentId();
  }

  public static com.filip.grpc.payment.PaymentId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentId>
      PARSER = new com.google.protobuf.AbstractParser<PaymentId>() {
    public PaymentId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaymentId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentId> getParserForType() {
    return PARSER;
  }

  public com.filip.grpc.payment.PaymentId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

