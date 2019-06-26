// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 * <pre>
 * The response for
 * [Datastore.AllocateIds][google.datastore.v1.Datastore.AllocateIds].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.AllocateIdsResponse}
 */
public  final class AllocateIdsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.AllocateIdsResponse)
    AllocateIdsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllocateIdsResponse.newBuilder() to construct.
  private AllocateIdsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocateIdsResponse() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllocateIdsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              keys_ = new java.util.ArrayList<com.google.datastore.v1.Key>();
              mutable_bitField0_ |= 0x00000001;
            }
            keys_.add(
                input.readMessage(com.google.datastore.v1.Key.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_AllocateIdsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.AllocateIdsResponse.class, com.google.datastore.v1.AllocateIdsResponse.Builder.class);
  }

  public static final int KEYS_FIELD_NUMBER = 1;
  private java.util.List<com.google.datastore.v1.Key> keys_;
  /**
   * <pre>
   * The keys specified in the request (in the same order), each with
   * its key path completed with a newly allocated ID.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1;</code>
   */
  public java.util.List<com.google.datastore.v1.Key> getKeysList() {
    return keys_;
  }
  /**
   * <pre>
   * The keys specified in the request (in the same order), each with
   * its key path completed with a newly allocated ID.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1;</code>
   */
  public java.util.List<? extends com.google.datastore.v1.KeyOrBuilder> 
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   * <pre>
   * The keys specified in the request (in the same order), each with
   * its key path completed with a newly allocated ID.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <pre>
   * The keys specified in the request (in the same order), each with
   * its key path completed with a newly allocated ID.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1;</code>
   */
  public com.google.datastore.v1.Key getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <pre>
   * The keys specified in the request (in the same order), each with
   * its key path completed with a newly allocated ID.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1;</code>
   */
  public com.google.datastore.v1.KeyOrBuilder getKeysOrBuilder(
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.datastore.v1.AllocateIdsResponse)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.AllocateIdsResponse other = (com.google.datastore.v1.AllocateIdsResponse) obj;

    boolean result = true;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.AllocateIdsResponse parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1.AllocateIdsResponse prototype) {
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
   * The response for
   * [Datastore.AllocateIds][google.datastore.v1.Datastore.AllocateIds].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.AllocateIdsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.AllocateIdsResponse)
      com.google.datastore.v1.AllocateIdsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_AllocateIdsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.AllocateIdsResponse.class, com.google.datastore.v1.AllocateIdsResponse.Builder.class);
    }

    // Construct using com.google.datastore.v1.AllocateIdsResponse.newBuilder()
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
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keysBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_AllocateIdsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.AllocateIdsResponse getDefaultInstanceForType() {
      return com.google.datastore.v1.AllocateIdsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.AllocateIdsResponse build() {
      com.google.datastore.v1.AllocateIdsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.AllocateIdsResponse buildPartial() {
      com.google.datastore.v1.AllocateIdsResponse result = new com.google.datastore.v1.AllocateIdsResponse(this);
      int from_bitField0_ = bitField0_;
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
      }
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
      if (other instanceof com.google.datastore.v1.AllocateIdsResponse) {
        return mergeFrom((com.google.datastore.v1.AllocateIdsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.AllocateIdsResponse other) {
      if (other == com.google.datastore.v1.AllocateIdsResponse.getDefaultInstance()) return this;
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
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
      com.google.datastore.v1.AllocateIdsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.AllocateIdsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.datastore.v1.Key> keys_ =
      java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        keys_ = new java.util.ArrayList<com.google.datastore.v1.Key>(keys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder> keysBuilder_;

    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public java.util.List<com.google.datastore.v1.Key> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public com.google.datastore.v1.Key getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1.Key value) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1.Key.Builder builderForValue) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder addKeys(com.google.datastore.v1.Key value) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1.Key value) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder addKeys(
        com.google.datastore.v1.Key.Builder builderForValue) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1.Key.Builder builderForValue) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.datastore.v1.Key> values) {
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
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
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public com.google.datastore.v1.Key.Builder getKeysBuilder(
        int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public com.google.datastore.v1.KeyOrBuilder getKeysOrBuilder(
        int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);  } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public java.util.List<? extends com.google.datastore.v1.KeyOrBuilder> 
         getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public com.google.datastore.v1.Key.Builder addKeysBuilder() {
      return getKeysFieldBuilder().addBuilder(
          com.google.datastore.v1.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public com.google.datastore.v1.Key.Builder addKeysBuilder(
        int index) {
      return getKeysFieldBuilder().addBuilder(
          index, com.google.datastore.v1.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * The keys specified in the request (in the same order), each with
     * its key path completed with a newly allocated ID.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 1;</code>
     */
    public java.util.List<com.google.datastore.v1.Key.Builder> 
         getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder> 
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder>(
                keys_,
                ((bitField0_ & 0x00000001) == 0x00000001),
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


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.AllocateIdsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.AllocateIdsResponse)
  private static final com.google.datastore.v1.AllocateIdsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.AllocateIdsResponse();
  }

  public static com.google.datastore.v1.AllocateIdsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocateIdsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllocateIdsResponse>() {
    @java.lang.Override
    public AllocateIdsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllocateIdsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllocateIdsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocateIdsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.AllocateIdsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

