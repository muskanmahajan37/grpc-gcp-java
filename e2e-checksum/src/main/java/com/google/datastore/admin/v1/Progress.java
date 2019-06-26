// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

/**
 * <pre>
 * Measures the progress of a particular metric.
 * </pre>
 *
 * Protobuf type {@code google.datastore.admin.v1.Progress}
 */
public  final class Progress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.admin.v1.Progress)
    ProgressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Progress.newBuilder() to construct.
  private Progress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Progress() {
    workCompleted_ = 0L;
    workEstimated_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Progress(
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
          case 8: {

            workCompleted_ = input.readInt64();
            break;
          }
          case 16: {

            workEstimated_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_Progress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_Progress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.admin.v1.Progress.class, com.google.datastore.admin.v1.Progress.Builder.class);
  }

  public static final int WORK_COMPLETED_FIELD_NUMBER = 1;
  private long workCompleted_;
  /**
   * <pre>
   * The amount of work that has been completed. Note that this may be greater
   * than work_estimated.
   * </pre>
   *
   * <code>int64 work_completed = 1;</code>
   */
  public long getWorkCompleted() {
    return workCompleted_;
  }

  public static final int WORK_ESTIMATED_FIELD_NUMBER = 2;
  private long workEstimated_;
  /**
   * <pre>
   * An estimate of how much work needs to be performed. May be zero if the
   * work estimate is unavailable.
   * </pre>
   *
   * <code>int64 work_estimated = 2;</code>
   */
  public long getWorkEstimated() {
    return workEstimated_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (workCompleted_ != 0L) {
      output.writeInt64(1, workCompleted_);
    }
    if (workEstimated_ != 0L) {
      output.writeInt64(2, workEstimated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workCompleted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, workCompleted_);
    }
    if (workEstimated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, workEstimated_);
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
    if (!(obj instanceof com.google.datastore.admin.v1.Progress)) {
      return super.equals(obj);
    }
    com.google.datastore.admin.v1.Progress other = (com.google.datastore.admin.v1.Progress) obj;

    boolean result = true;
    result = result && (getWorkCompleted()
        == other.getWorkCompleted());
    result = result && (getWorkEstimated()
        == other.getWorkEstimated());
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
    hash = (37 * hash) + WORK_COMPLETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkCompleted());
    hash = (37 * hash) + WORK_ESTIMATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkEstimated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.admin.v1.Progress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.Progress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.Progress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.admin.v1.Progress parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.datastore.admin.v1.Progress prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Measures the progress of a particular metric.
   * </pre>
   *
   * Protobuf type {@code google.datastore.admin.v1.Progress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.admin.v1.Progress)
      com.google.datastore.admin.v1.ProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_Progress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_Progress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.admin.v1.Progress.class, com.google.datastore.admin.v1.Progress.Builder.class);
    }

    // Construct using com.google.datastore.admin.v1.Progress.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      workCompleted_ = 0L;

      workEstimated_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.admin.v1.DatastoreAdminProto.internal_static_google_datastore_admin_v1_Progress_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.Progress getDefaultInstanceForType() {
      return com.google.datastore.admin.v1.Progress.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.Progress build() {
      com.google.datastore.admin.v1.Progress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.Progress buildPartial() {
      com.google.datastore.admin.v1.Progress result = new com.google.datastore.admin.v1.Progress(this);
      result.workCompleted_ = workCompleted_;
      result.workEstimated_ = workEstimated_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.admin.v1.Progress) {
        return mergeFrom((com.google.datastore.admin.v1.Progress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.admin.v1.Progress other) {
      if (other == com.google.datastore.admin.v1.Progress.getDefaultInstance()) return this;
      if (other.getWorkCompleted() != 0L) {
        setWorkCompleted(other.getWorkCompleted());
      }
      if (other.getWorkEstimated() != 0L) {
        setWorkEstimated(other.getWorkEstimated());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.datastore.admin.v1.Progress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.admin.v1.Progress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long workCompleted_ ;
    /**
     * <pre>
     * The amount of work that has been completed. Note that this may be greater
     * than work_estimated.
     * </pre>
     *
     * <code>int64 work_completed = 1;</code>
     */
    public long getWorkCompleted() {
      return workCompleted_;
    }
    /**
     * <pre>
     * The amount of work that has been completed. Note that this may be greater
     * than work_estimated.
     * </pre>
     *
     * <code>int64 work_completed = 1;</code>
     */
    public Builder setWorkCompleted(long value) {
      
      workCompleted_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of work that has been completed. Note that this may be greater
     * than work_estimated.
     * </pre>
     *
     * <code>int64 work_completed = 1;</code>
     */
    public Builder clearWorkCompleted() {
      
      workCompleted_ = 0L;
      onChanged();
      return this;
    }

    private long workEstimated_ ;
    /**
     * <pre>
     * An estimate of how much work needs to be performed. May be zero if the
     * work estimate is unavailable.
     * </pre>
     *
     * <code>int64 work_estimated = 2;</code>
     */
    public long getWorkEstimated() {
      return workEstimated_;
    }
    /**
     * <pre>
     * An estimate of how much work needs to be performed. May be zero if the
     * work estimate is unavailable.
     * </pre>
     *
     * <code>int64 work_estimated = 2;</code>
     */
    public Builder setWorkEstimated(long value) {
      
      workEstimated_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An estimate of how much work needs to be performed. May be zero if the
     * work estimate is unavailable.
     * </pre>
     *
     * <code>int64 work_estimated = 2;</code>
     */
    public Builder clearWorkEstimated() {
      
      workEstimated_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.admin.v1.Progress)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.admin.v1.Progress)
  private static final com.google.datastore.admin.v1.Progress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.admin.v1.Progress();
  }

  public static com.google.datastore.admin.v1.Progress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Progress>
      PARSER = new com.google.protobuf.AbstractParser<Progress>() {
    @java.lang.Override
    public Progress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Progress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Progress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Progress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.admin.v1.Progress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

