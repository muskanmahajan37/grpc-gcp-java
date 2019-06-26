// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/decl.proto

package com.google.api.expr.v1beta1;

/**
 * <pre>
 * A function declaration.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1beta1.FunctionDecl}
 */
public  final class FunctionDecl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1beta1.FunctionDecl)
    FunctionDeclOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionDecl.newBuilder() to construct.
  private FunctionDecl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionDecl() {
    args_ = java.util.Collections.emptyList();
    receiverFunction_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FunctionDecl(
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
              args_ = new java.util.ArrayList<com.google.api.expr.v1beta1.IdentDecl>();
              mutable_bitField0_ |= 0x00000001;
            }
            args_.add(
                input.readMessage(com.google.api.expr.v1beta1.IdentDecl.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.api.expr.v1beta1.DeclType.Builder subBuilder = null;
            if (returnType_ != null) {
              subBuilder = returnType_.toBuilder();
            }
            returnType_ = input.readMessage(com.google.api.expr.v1beta1.DeclType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(returnType_);
              returnType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            receiverFunction_ = input.readBool();
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
        args_ = java.util.Collections.unmodifiableList(args_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.expr.v1beta1.DeclProto.internal_static_google_api_expr_v1beta1_FunctionDecl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1beta1.DeclProto.internal_static_google_api_expr_v1beta1_FunctionDecl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1beta1.FunctionDecl.class, com.google.api.expr.v1beta1.FunctionDecl.Builder.class);
  }

  private int bitField0_;
  public static final int ARGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.expr.v1beta1.IdentDecl> args_;
  /**
   * <pre>
   * The function arguments.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
   */
  public java.util.List<com.google.api.expr.v1beta1.IdentDecl> getArgsList() {
    return args_;
  }
  /**
   * <pre>
   * The function arguments.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
   */
  public java.util.List<? extends com.google.api.expr.v1beta1.IdentDeclOrBuilder> 
      getArgsOrBuilderList() {
    return args_;
  }
  /**
   * <pre>
   * The function arguments.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
   */
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <pre>
   * The function arguments.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
   */
  public com.google.api.expr.v1beta1.IdentDecl getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <pre>
   * The function arguments.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
   */
  public com.google.api.expr.v1beta1.IdentDeclOrBuilder getArgsOrBuilder(
      int index) {
    return args_.get(index);
  }

  public static final int RETURN_TYPE_FIELD_NUMBER = 2;
  private com.google.api.expr.v1beta1.DeclType returnType_;
  /**
   * <pre>
   * Optional declared return type.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
   */
  public boolean hasReturnType() {
    return returnType_ != null;
  }
  /**
   * <pre>
   * Optional declared return type.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
   */
  public com.google.api.expr.v1beta1.DeclType getReturnType() {
    return returnType_ == null ? com.google.api.expr.v1beta1.DeclType.getDefaultInstance() : returnType_;
  }
  /**
   * <pre>
   * Optional declared return type.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
   */
  public com.google.api.expr.v1beta1.DeclTypeOrBuilder getReturnTypeOrBuilder() {
    return getReturnType();
  }

  public static final int RECEIVER_FUNCTION_FIELD_NUMBER = 3;
  private boolean receiverFunction_;
  /**
   * <pre>
   * If the first argument of the function is the receiver.
   * </pre>
   *
   * <code>bool receiver_function = 3;</code>
   */
  public boolean getReceiverFunction() {
    return receiverFunction_;
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
    for (int i = 0; i < args_.size(); i++) {
      output.writeMessage(1, args_.get(i));
    }
    if (returnType_ != null) {
      output.writeMessage(2, getReturnType());
    }
    if (receiverFunction_ != false) {
      output.writeBool(3, receiverFunction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < args_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, args_.get(i));
    }
    if (returnType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReturnType());
    }
    if (receiverFunction_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, receiverFunction_);
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
    if (!(obj instanceof com.google.api.expr.v1beta1.FunctionDecl)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1beta1.FunctionDecl other = (com.google.api.expr.v1beta1.FunctionDecl) obj;

    boolean result = true;
    result = result && getArgsList()
        .equals(other.getArgsList());
    result = result && (hasReturnType() == other.hasReturnType());
    if (hasReturnType()) {
      result = result && getReturnType()
          .equals(other.getReturnType());
    }
    result = result && (getReceiverFunction()
        == other.getReceiverFunction());
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
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    if (hasReturnType()) {
      hash = (37 * hash) + RETURN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReturnType().hashCode();
    }
    hash = (37 * hash) + RECEIVER_FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReceiverFunction());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.FunctionDecl parseFrom(
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
  public static Builder newBuilder(com.google.api.expr.v1beta1.FunctionDecl prototype) {
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
   * A function declaration.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1beta1.FunctionDecl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1beta1.FunctionDecl)
      com.google.api.expr.v1beta1.FunctionDeclOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1beta1.DeclProto.internal_static_google_api_expr_v1beta1_FunctionDecl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1beta1.DeclProto.internal_static_google_api_expr_v1beta1_FunctionDecl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1beta1.FunctionDecl.class, com.google.api.expr.v1beta1.FunctionDecl.Builder.class);
    }

    // Construct using com.google.api.expr.v1beta1.FunctionDecl.newBuilder()
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
        getArgsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        argsBuilder_.clear();
      }
      if (returnTypeBuilder_ == null) {
        returnType_ = null;
      } else {
        returnType_ = null;
        returnTypeBuilder_ = null;
      }
      receiverFunction_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1beta1.DeclProto.internal_static_google_api_expr_v1beta1_FunctionDecl_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.FunctionDecl getDefaultInstanceForType() {
      return com.google.api.expr.v1beta1.FunctionDecl.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.FunctionDecl build() {
      com.google.api.expr.v1beta1.FunctionDecl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.FunctionDecl buildPartial() {
      com.google.api.expr.v1beta1.FunctionDecl result = new com.google.api.expr.v1beta1.FunctionDecl(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.args_ = args_;
      } else {
        result.args_ = argsBuilder_.build();
      }
      if (returnTypeBuilder_ == null) {
        result.returnType_ = returnType_;
      } else {
        result.returnType_ = returnTypeBuilder_.build();
      }
      result.receiverFunction_ = receiverFunction_;
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
      if (other instanceof com.google.api.expr.v1beta1.FunctionDecl) {
        return mergeFrom((com.google.api.expr.v1beta1.FunctionDecl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1beta1.FunctionDecl other) {
      if (other == com.google.api.expr.v1beta1.FunctionDecl.getDefaultInstance()) return this;
      if (argsBuilder_ == null) {
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
      } else {
        if (!other.args_.isEmpty()) {
          if (argsBuilder_.isEmpty()) {
            argsBuilder_.dispose();
            argsBuilder_ = null;
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000001);
            argsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgsFieldBuilder() : null;
          } else {
            argsBuilder_.addAllMessages(other.args_);
          }
        }
      }
      if (other.hasReturnType()) {
        mergeReturnType(other.getReturnType());
      }
      if (other.getReceiverFunction() != false) {
        setReceiverFunction(other.getReceiverFunction());
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
      com.google.api.expr.v1beta1.FunctionDecl parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.expr.v1beta1.FunctionDecl) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.expr.v1beta1.IdentDecl> args_ =
      java.util.Collections.emptyList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        args_ = new java.util.ArrayList<com.google.api.expr.v1beta1.IdentDecl>(args_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.expr.v1beta1.IdentDecl, com.google.api.expr.v1beta1.IdentDecl.Builder, com.google.api.expr.v1beta1.IdentDeclOrBuilder> argsBuilder_;

    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public java.util.List<com.google.api.expr.v1beta1.IdentDecl> getArgsList() {
      if (argsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(args_);
      } else {
        return argsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public int getArgsCount() {
      if (argsBuilder_ == null) {
        return args_.size();
      } else {
        return argsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public com.google.api.expr.v1beta1.IdentDecl getArgs(int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);
      } else {
        return argsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder setArgs(
        int index, com.google.api.expr.v1beta1.IdentDecl value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
      } else {
        argsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder setArgs(
        int index, com.google.api.expr.v1beta1.IdentDecl.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.set(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder addArgs(com.google.api.expr.v1beta1.IdentDecl value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
      } else {
        argsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder addArgs(
        int index, com.google.api.expr.v1beta1.IdentDecl value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(index, value);
        onChanged();
      } else {
        argsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder addArgs(
        com.google.api.expr.v1beta1.IdentDecl.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder addArgs(
        int index, com.google.api.expr.v1beta1.IdentDecl.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends com.google.api.expr.v1beta1.IdentDecl> values) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
      } else {
        argsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder clearArgs() {
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        argsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public Builder removeArgs(int index) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.remove(index);
        onChanged();
      } else {
        argsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public com.google.api.expr.v1beta1.IdentDecl.Builder getArgsBuilder(
        int index) {
      return getArgsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public com.google.api.expr.v1beta1.IdentDeclOrBuilder getArgsOrBuilder(
        int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);  } else {
        return argsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public java.util.List<? extends com.google.api.expr.v1beta1.IdentDeclOrBuilder> 
         getArgsOrBuilderList() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(args_);
      }
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public com.google.api.expr.v1beta1.IdentDecl.Builder addArgsBuilder() {
      return getArgsFieldBuilder().addBuilder(
          com.google.api.expr.v1beta1.IdentDecl.getDefaultInstance());
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public com.google.api.expr.v1beta1.IdentDecl.Builder addArgsBuilder(
        int index) {
      return getArgsFieldBuilder().addBuilder(
          index, com.google.api.expr.v1beta1.IdentDecl.getDefaultInstance());
    }
    /**
     * <pre>
     * The function arguments.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdentDecl args = 1;</code>
     */
    public java.util.List<com.google.api.expr.v1beta1.IdentDecl.Builder> 
         getArgsBuilderList() {
      return getArgsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.expr.v1beta1.IdentDecl, com.google.api.expr.v1beta1.IdentDecl.Builder, com.google.api.expr.v1beta1.IdentDeclOrBuilder> 
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.expr.v1beta1.IdentDecl, com.google.api.expr.v1beta1.IdentDecl.Builder, com.google.api.expr.v1beta1.IdentDeclOrBuilder>(
                args_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        args_ = null;
      }
      return argsBuilder_;
    }

    private com.google.api.expr.v1beta1.DeclType returnType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.expr.v1beta1.DeclType, com.google.api.expr.v1beta1.DeclType.Builder, com.google.api.expr.v1beta1.DeclTypeOrBuilder> returnTypeBuilder_;
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public boolean hasReturnType() {
      return returnTypeBuilder_ != null || returnType_ != null;
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public com.google.api.expr.v1beta1.DeclType getReturnType() {
      if (returnTypeBuilder_ == null) {
        return returnType_ == null ? com.google.api.expr.v1beta1.DeclType.getDefaultInstance() : returnType_;
      } else {
        return returnTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public Builder setReturnType(com.google.api.expr.v1beta1.DeclType value) {
      if (returnTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnType_ = value;
        onChanged();
      } else {
        returnTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public Builder setReturnType(
        com.google.api.expr.v1beta1.DeclType.Builder builderForValue) {
      if (returnTypeBuilder_ == null) {
        returnType_ = builderForValue.build();
        onChanged();
      } else {
        returnTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public Builder mergeReturnType(com.google.api.expr.v1beta1.DeclType value) {
      if (returnTypeBuilder_ == null) {
        if (returnType_ != null) {
          returnType_ =
            com.google.api.expr.v1beta1.DeclType.newBuilder(returnType_).mergeFrom(value).buildPartial();
        } else {
          returnType_ = value;
        }
        onChanged();
      } else {
        returnTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public Builder clearReturnType() {
      if (returnTypeBuilder_ == null) {
        returnType_ = null;
        onChanged();
      } else {
        returnType_ = null;
        returnTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public com.google.api.expr.v1beta1.DeclType.Builder getReturnTypeBuilder() {
      
      onChanged();
      return getReturnTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    public com.google.api.expr.v1beta1.DeclTypeOrBuilder getReturnTypeOrBuilder() {
      if (returnTypeBuilder_ != null) {
        return returnTypeBuilder_.getMessageOrBuilder();
      } else {
        return returnType_ == null ?
            com.google.api.expr.v1beta1.DeclType.getDefaultInstance() : returnType_;
      }
    }
    /**
     * <pre>
     * Optional declared return type.
     * </pre>
     *
     * <code>.google.api.expr.v1beta1.DeclType return_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.expr.v1beta1.DeclType, com.google.api.expr.v1beta1.DeclType.Builder, com.google.api.expr.v1beta1.DeclTypeOrBuilder> 
        getReturnTypeFieldBuilder() {
      if (returnTypeBuilder_ == null) {
        returnTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.expr.v1beta1.DeclType, com.google.api.expr.v1beta1.DeclType.Builder, com.google.api.expr.v1beta1.DeclTypeOrBuilder>(
                getReturnType(),
                getParentForChildren(),
                isClean());
        returnType_ = null;
      }
      return returnTypeBuilder_;
    }

    private boolean receiverFunction_ ;
    /**
     * <pre>
     * If the first argument of the function is the receiver.
     * </pre>
     *
     * <code>bool receiver_function = 3;</code>
     */
    public boolean getReceiverFunction() {
      return receiverFunction_;
    }
    /**
     * <pre>
     * If the first argument of the function is the receiver.
     * </pre>
     *
     * <code>bool receiver_function = 3;</code>
     */
    public Builder setReceiverFunction(boolean value) {
      
      receiverFunction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the first argument of the function is the receiver.
     * </pre>
     *
     * <code>bool receiver_function = 3;</code>
     */
    public Builder clearReceiverFunction() {
      
      receiverFunction_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1beta1.FunctionDecl)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1beta1.FunctionDecl)
  private static final com.google.api.expr.v1beta1.FunctionDecl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1beta1.FunctionDecl();
  }

  public static com.google.api.expr.v1beta1.FunctionDecl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionDecl>
      PARSER = new com.google.protobuf.AbstractParser<FunctionDecl>() {
    @java.lang.Override
    public FunctionDecl parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FunctionDecl(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FunctionDecl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionDecl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1beta1.FunctionDecl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

