// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

/**
 * <pre>
 * A partition ID identifies a grouping of entities. The grouping is always
 * by project and namespace, however the namespace ID may be empty.
 * A partition ID contains several dimensions:
 * project ID and namespace ID.
 * Partition dimensions:
 * - May be `""`.
 * - Must be valid UTF-8 bytes.
 * - Must have values that match regex `[A-Za-z&#92;d&#92;.&#92;-_]{1,100}`
 * If the value of any dimension matches regex `__.*__`, the partition is
 * reserved/read-only.
 * A reserved/read-only partition ID is forbidden in certain documented
 * contexts.
 * Foreign partition IDs (in which the project ID does
 * not match the context project ID ) are discouraged.
 * Reads and writes of foreign partition IDs may fail if the project is not in
 * an active state.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.PartitionId}
 */
public  final class PartitionId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.PartitionId)
    PartitionIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionId.newBuilder() to construct.
  private PartitionId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionId() {
    projectId_ = "";
    namespaceId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartitionId(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            namespaceId_ = s;
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
    return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_PartitionId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_PartitionId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.PartitionId.class, com.google.datastore.v1.PartitionId.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The ID of the project to which the entities belong.
   * </pre>
   *
   * <code>string project_id = 2;</code>
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
   * The ID of the project to which the entities belong.
   * </pre>
   *
   * <code>string project_id = 2;</code>
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

  public static final int NAMESPACE_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object namespaceId_;
  /**
   * <pre>
   * If not empty, the ID of the namespace to which the entities belong.
   * </pre>
   *
   * <code>string namespace_id = 4;</code>
   */
  public java.lang.String getNamespaceId() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespaceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If not empty, the ID of the namespace to which the entities belong.
   * </pre>
   *
   * <code>string namespace_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNamespaceIdBytes() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespaceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectId_);
    }
    if (!getNamespaceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, namespaceId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, projectId_);
    }
    if (!getNamespaceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, namespaceId_);
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
    if (!(obj instanceof com.google.datastore.v1.PartitionId)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.PartitionId other = (com.google.datastore.v1.PartitionId) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getNamespaceId()
        .equals(other.getNamespaceId());
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
    hash = (37 * hash) + NAMESPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNamespaceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.PartitionId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.PartitionId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PartitionId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PartitionId parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1.PartitionId prototype) {
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
   * A partition ID identifies a grouping of entities. The grouping is always
   * by project and namespace, however the namespace ID may be empty.
   * A partition ID contains several dimensions:
   * project ID and namespace ID.
   * Partition dimensions:
   * - May be `""`.
   * - Must be valid UTF-8 bytes.
   * - Must have values that match regex `[A-Za-z&#92;d&#92;.&#92;-_]{1,100}`
   * If the value of any dimension matches regex `__.*__`, the partition is
   * reserved/read-only.
   * A reserved/read-only partition ID is forbidden in certain documented
   * contexts.
   * Foreign partition IDs (in which the project ID does
   * not match the context project ID ) are discouraged.
   * Reads and writes of foreign partition IDs may fail if the project is not in
   * an active state.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.PartitionId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.PartitionId)
      com.google.datastore.v1.PartitionIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_PartitionId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_PartitionId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.PartitionId.class, com.google.datastore.v1.PartitionId.Builder.class);
    }

    // Construct using com.google.datastore.v1.PartitionId.newBuilder()
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
      projectId_ = "";

      namespaceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_PartitionId_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.PartitionId getDefaultInstanceForType() {
      return com.google.datastore.v1.PartitionId.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.PartitionId build() {
      com.google.datastore.v1.PartitionId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.PartitionId buildPartial() {
      com.google.datastore.v1.PartitionId result = new com.google.datastore.v1.PartitionId(this);
      result.projectId_ = projectId_;
      result.namespaceId_ = namespaceId_;
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
      if (other instanceof com.google.datastore.v1.PartitionId) {
        return mergeFrom((com.google.datastore.v1.PartitionId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.PartitionId other) {
      if (other == com.google.datastore.v1.PartitionId.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getNamespaceId().isEmpty()) {
        namespaceId_ = other.namespaceId_;
        onChanged();
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
      com.google.datastore.v1.PartitionId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.PartitionId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The ID of the project to which the entities belong.
     * </pre>
     *
     * <code>string project_id = 2;</code>
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
     * The ID of the project to which the entities belong.
     * </pre>
     *
     * <code>string project_id = 2;</code>
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
     * The ID of the project to which the entities belong.
     * </pre>
     *
     * <code>string project_id = 2;</code>
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
     * The ID of the project to which the entities belong.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project to which the entities belong.
     * </pre>
     *
     * <code>string project_id = 2;</code>
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

    private java.lang.Object namespaceId_ = "";
    /**
     * <pre>
     * If not empty, the ID of the namespace to which the entities belong.
     * </pre>
     *
     * <code>string namespace_id = 4;</code>
     */
    public java.lang.String getNamespaceId() {
      java.lang.Object ref = namespaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespaceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If not empty, the ID of the namespace to which the entities belong.
     * </pre>
     *
     * <code>string namespace_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNamespaceIdBytes() {
      java.lang.Object ref = namespaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespaceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If not empty, the ID of the namespace to which the entities belong.
     * </pre>
     *
     * <code>string namespace_id = 4;</code>
     */
    public Builder setNamespaceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespaceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, the ID of the namespace to which the entities belong.
     * </pre>
     *
     * <code>string namespace_id = 4;</code>
     */
    public Builder clearNamespaceId() {
      
      namespaceId_ = getDefaultInstance().getNamespaceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, the ID of the namespace to which the entities belong.
     * </pre>
     *
     * <code>string namespace_id = 4;</code>
     */
    public Builder setNamespaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespaceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.PartitionId)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.PartitionId)
  private static final com.google.datastore.v1.PartitionId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.PartitionId();
  }

  public static com.google.datastore.v1.PartitionId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionId>
      PARSER = new com.google.protobuf.AbstractParser<PartitionId>() {
    @java.lang.Override
    public PartitionId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartitionId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.PartitionId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

