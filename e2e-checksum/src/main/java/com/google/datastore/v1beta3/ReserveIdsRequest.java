// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

/**
 * <pre>
 * The request for
 * [Datastore.ReserveIds][google.datastore.v1beta3.Datastore.ReserveIds].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1beta3.ReserveIdsRequest}
 */
public  final class ReserveIdsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1beta3.ReserveIdsRequest)
    ReserveIdsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReserveIdsRequest.newBuilder() to construct.
  private ReserveIdsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReserveIdsRequest() {
    projectId_ = "";
    databaseId_ = "";
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReserveIdsRequest(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              keys_ = new java.util.ArrayList<com.google.datastore.v1beta3.Key>();
              mutable_bitField0_ |= 0x00000004;
            }
            keys_.add(
                input.readMessage(com.google.datastore.v1beta3.Key.parser(), extensionRegistry));
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 74: {
            java.lang.String s = input.readStringRequireUtf8();

            databaseId_ = s;
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1beta3.DatastoreProto.internal_static_google_datastore_v1beta3_ReserveIdsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1beta3.DatastoreProto.internal_static_google_datastore_v1beta3_ReserveIdsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1beta3.ReserveIdsRequest.class, com.google.datastore.v1beta3.ReserveIdsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATABASE_ID_FIELD_NUMBER = 9;
  private volatile java.lang.Object databaseId_;
  /**
   * <pre>
   * If not empty, the ID of the database against which to make the request.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   */
  public java.lang.String getDatabaseId() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If not empty, the ID of the database against which to make the request.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   */
  public com.google.protobuf.ByteString
      getDatabaseIdBytes() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      databaseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEYS_FIELD_NUMBER = 1;
  private java.util.List<com.google.datastore.v1beta3.Key> keys_;
  /**
   * <pre>
   * A list of keys with complete key paths whose numeric IDs should not be
   * auto-allocated.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
   */
  public java.util.List<com.google.datastore.v1beta3.Key> getKeysList() {
    return keys_;
  }
  /**
   * <pre>
   * A list of keys with complete key paths whose numeric IDs should not be
   * auto-allocated.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
   */
  public java.util.List<? extends com.google.datastore.v1beta3.KeyOrBuilder> 
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   * <pre>
   * A list of keys with complete key paths whose numeric IDs should not be
   * auto-allocated.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <pre>
   * A list of keys with complete key paths whose numeric IDs should not be
   * auto-allocated.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
   */
  public com.google.datastore.v1beta3.Key getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <pre>
   * A list of keys with complete key paths whose numeric IDs should not be
   * auto-allocated.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
   */
  public com.google.datastore.v1beta3.KeyOrBuilder getKeysOrBuilder(
      int index) {
    return keys_.get(index);
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
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(1, keys_.get(i));
    }
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
    if (!getDatabaseIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, databaseId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keys_.get(i));
    }
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
    }
    if (!getDatabaseIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, databaseId_);
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
    if (!(obj instanceof com.google.datastore.v1beta3.ReserveIdsRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1beta3.ReserveIdsRequest other = (com.google.datastore.v1beta3.ReserveIdsRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getDatabaseId()
        .equals(other.getDatabaseId());
    result = result && getKeysList()
        .equals(other.getKeysList());
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + DATABASE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseId().hashCode();
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.ReserveIdsRequest parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1beta3.ReserveIdsRequest prototype) {
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
   * The request for
   * [Datastore.ReserveIds][google.datastore.v1beta3.Datastore.ReserveIds].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1beta3.ReserveIdsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1beta3.ReserveIdsRequest)
      com.google.datastore.v1beta3.ReserveIdsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1beta3.DatastoreProto.internal_static_google_datastore_v1beta3_ReserveIdsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1beta3.DatastoreProto.internal_static_google_datastore_v1beta3_ReserveIdsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1beta3.ReserveIdsRequest.class, com.google.datastore.v1beta3.ReserveIdsRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1beta3.ReserveIdsRequest.newBuilder()
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
        getKeysFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      databaseId_ = "";

      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        keysBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1beta3.DatastoreProto.internal_static_google_datastore_v1beta3_ReserveIdsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.ReserveIdsRequest getDefaultInstanceForType() {
      return com.google.datastore.v1beta3.ReserveIdsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.ReserveIdsRequest build() {
      com.google.datastore.v1beta3.ReserveIdsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.ReserveIdsRequest buildPartial() {
      com.google.datastore.v1beta3.ReserveIdsRequest result = new com.google.datastore.v1beta3.ReserveIdsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.projectId_ = projectId_;
      result.databaseId_ = databaseId_;
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.datastore.v1beta3.ReserveIdsRequest) {
        return mergeFrom((com.google.datastore.v1beta3.ReserveIdsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1beta3.ReserveIdsRequest other) {
      if (other == com.google.datastore.v1beta3.ReserveIdsRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getDatabaseId().isEmpty()) {
        databaseId_ = other.databaseId_;
        onChanged();
      }
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000004);
            keysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeysFieldBuilder() : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
          }
        }
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
      com.google.datastore.v1beta3.ReserveIdsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1beta3.ReserveIdsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object databaseId_ = "";
    /**
     * <pre>
     * If not empty, the ID of the database against which to make the request.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     */
    public java.lang.String getDatabaseId() {
      java.lang.Object ref = databaseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If not empty, the ID of the database against which to make the request.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     */
    public com.google.protobuf.ByteString
        getDatabaseIdBytes() {
      java.lang.Object ref = databaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        databaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If not empty, the ID of the database against which to make the request.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     */
    public Builder setDatabaseId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      databaseId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, the ID of the database against which to make the request.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     */
    public Builder clearDatabaseId() {
      
      databaseId_ = getDefaultInstance().getDatabaseId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, the ID of the database against which to make the request.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     */
    public Builder setDatabaseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      databaseId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.datastore.v1beta3.Key> keys_ =
      java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        keys_ = new java.util.ArrayList<com.google.datastore.v1beta3.Key>(keys_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1beta3.Key, com.google.datastore.v1beta3.Key.Builder, com.google.datastore.v1beta3.KeyOrBuilder> keysBuilder_;

    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public java.util.List<com.google.datastore.v1beta3.Key> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public com.google.datastore.v1beta3.Key getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1beta3.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1beta3.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder addKeys(com.google.datastore.v1beta3.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1beta3.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder addKeys(
        com.google.datastore.v1beta3.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1beta3.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.datastore.v1beta3.Key> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public com.google.datastore.v1beta3.Key.Builder getKeysBuilder(
        int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public com.google.datastore.v1beta3.KeyOrBuilder getKeysOrBuilder(
        int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);  } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public java.util.List<? extends com.google.datastore.v1beta3.KeyOrBuilder> 
         getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public com.google.datastore.v1beta3.Key.Builder addKeysBuilder() {
      return getKeysFieldBuilder().addBuilder(
          com.google.datastore.v1beta3.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public com.google.datastore.v1beta3.Key.Builder addKeysBuilder(
        int index) {
      return getKeysFieldBuilder().addBuilder(
          index, com.google.datastore.v1beta3.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of keys with complete key paths whose numeric IDs should not be
     * auto-allocated.
     * </pre>
     *
     * <code>repeated .google.datastore.v1beta3.Key keys = 1;</code>
     */
    public java.util.List<com.google.datastore.v1beta3.Key.Builder> 
         getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1beta3.Key, com.google.datastore.v1beta3.Key.Builder, com.google.datastore.v1beta3.KeyOrBuilder> 
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1beta3.Key, com.google.datastore.v1beta3.Key.Builder, com.google.datastore.v1beta3.KeyOrBuilder>(
                keys_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        keys_ = null;
      }
      return keysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.datastore.v1beta3.ReserveIdsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1beta3.ReserveIdsRequest)
  private static final com.google.datastore.v1beta3.ReserveIdsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1beta3.ReserveIdsRequest();
  }

  public static com.google.datastore.v1beta3.ReserveIdsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReserveIdsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReserveIdsRequest>() {
    @java.lang.Override
    public ReserveIdsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReserveIdsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReserveIdsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReserveIdsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1beta3.ReserveIdsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

