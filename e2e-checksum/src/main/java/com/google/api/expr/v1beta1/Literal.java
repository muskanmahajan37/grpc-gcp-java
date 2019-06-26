// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/expr.proto

package com.google.api.expr.v1beta1;

/**
 * <pre>
 * Represents a primitive literal.
 * This is similar to the primitives supported in the well-known type
 * `google.protobuf.Value`, but richer so it can represent CEL's full range of
 * primitives.
 * Lists and structs are not included as constants as these aggregate types may
 * contain [Expr][google.api.expr.v1beta1.Expr] elements which require
 * evaluation and are thus not constant.
 * Examples of literals include: `"hello"`, `b'bytes'`, `1u`, `4.2`, `-2`,
 * `true`, `null`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1beta1.Literal}
 */
public  final class Literal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1beta1.Literal)
    LiteralOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Literal.newBuilder() to construct.
  private Literal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Literal() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Literal(
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
            int rawValue = input.readEnum();
            constantKindCase_ = 1;
            constantKind_ = rawValue;
            break;
          }
          case 16: {
            constantKindCase_ = 2;
            constantKind_ = input.readBool();
            break;
          }
          case 24: {
            constantKindCase_ = 3;
            constantKind_ = input.readInt64();
            break;
          }
          case 32: {
            constantKindCase_ = 4;
            constantKind_ = input.readUInt64();
            break;
          }
          case 41: {
            constantKindCase_ = 5;
            constantKind_ = input.readDouble();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            constantKindCase_ = 6;
            constantKind_ = s;
            break;
          }
          case 58: {
            constantKindCase_ = 7;
            constantKind_ = input.readBytes();
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
    return com.google.api.expr.v1beta1.ExprProto.internal_static_google_api_expr_v1beta1_Literal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1beta1.ExprProto.internal_static_google_api_expr_v1beta1_Literal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1beta1.Literal.class, com.google.api.expr.v1beta1.Literal.Builder.class);
  }

  private int constantKindCase_ = 0;
  private java.lang.Object constantKind_;
  public enum ConstantKindCase
      implements com.google.protobuf.Internal.EnumLite {
    NULL_VALUE(1),
    BOOL_VALUE(2),
    INT64_VALUE(3),
    UINT64_VALUE(4),
    DOUBLE_VALUE(5),
    STRING_VALUE(6),
    BYTES_VALUE(7),
    CONSTANTKIND_NOT_SET(0);
    private final int value;
    private ConstantKindCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConstantKindCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConstantKindCase forNumber(int value) {
      switch (value) {
        case 1: return NULL_VALUE;
        case 2: return BOOL_VALUE;
        case 3: return INT64_VALUE;
        case 4: return UINT64_VALUE;
        case 5: return DOUBLE_VALUE;
        case 6: return STRING_VALUE;
        case 7: return BYTES_VALUE;
        case 0: return CONSTANTKIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConstantKindCase
  getConstantKindCase() {
    return ConstantKindCase.forNumber(
        constantKindCase_);
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   */
  public int getNullValueValue() {
    if (constantKindCase_ == 1) {
      return (java.lang.Integer) constantKind_;
    }
    return 0;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   */
  public com.google.protobuf.NullValue getNullValue() {
    if (constantKindCase_ == 1) {
      @SuppressWarnings("deprecation")
      com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
          (java.lang.Integer) constantKind_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2;</code>
   */
  public boolean getBoolValue() {
    if (constantKindCase_ == 2) {
      return (java.lang.Boolean) constantKind_;
    }
    return false;
  }

  public static final int INT64_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3;</code>
   */
  public long getInt64Value() {
    if (constantKindCase_ == 3) {
      return (java.lang.Long) constantKind_;
    }
    return 0L;
  }

  public static final int UINT64_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4;</code>
   */
  public long getUint64Value() {
    if (constantKindCase_ == 4) {
      return (java.lang.Long) constantKind_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5;</code>
   */
  public double getDoubleValue() {
    if (constantKindCase_ == 5) {
      return (java.lang.Double) constantKind_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 6;
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (constantKindCase_ == 6) {
      ref = constantKind_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (constantKindCase_ == 6) {
        constantKind_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (constantKindCase_ == 6) {
      ref = constantKind_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (constantKindCase_ == 6) {
        constantKind_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BYTES_VALUE_FIELD_NUMBER = 7;
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7;</code>
   */
  public com.google.protobuf.ByteString getBytesValue() {
    if (constantKindCase_ == 7) {
      return (com.google.protobuf.ByteString) constantKind_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (constantKindCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) constantKind_));
    }
    if (constantKindCase_ == 2) {
      output.writeBool(
          2, (boolean)((java.lang.Boolean) constantKind_));
    }
    if (constantKindCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) constantKind_));
    }
    if (constantKindCase_ == 4) {
      output.writeUInt64(
          4, (long)((java.lang.Long) constantKind_));
    }
    if (constantKindCase_ == 5) {
      output.writeDouble(
          5, (double)((java.lang.Double) constantKind_));
    }
    if (constantKindCase_ == 6) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, constantKind_);
    }
    if (constantKindCase_ == 7) {
      output.writeBytes(
          7, (com.google.protobuf.ByteString) constantKind_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (constantKindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) constantKind_));
    }
    if (constantKindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            2, (boolean)((java.lang.Boolean) constantKind_));
    }
    if (constantKindCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) constantKind_));
    }
    if (constantKindCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(
            4, (long)((java.lang.Long) constantKind_));
    }
    if (constantKindCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            5, (double)((java.lang.Double) constantKind_));
    }
    if (constantKindCase_ == 6) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, constantKind_);
    }
    if (constantKindCase_ == 7) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            7, (com.google.protobuf.ByteString) constantKind_);
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
    if (!(obj instanceof com.google.api.expr.v1beta1.Literal)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1beta1.Literal other = (com.google.api.expr.v1beta1.Literal) obj;

    boolean result = true;
    result = result && getConstantKindCase().equals(
        other.getConstantKindCase());
    if (!result) return false;
    switch (constantKindCase_) {
      case 1:
        result = result && getNullValueValue()
            == other.getNullValueValue();
        break;
      case 2:
        result = result && (getBoolValue()
            == other.getBoolValue());
        break;
      case 3:
        result = result && (getInt64Value()
            == other.getInt64Value());
        break;
      case 4:
        result = result && (getUint64Value()
            == other.getUint64Value());
        break;
      case 5:
        result = result && (
            java.lang.Double.doubleToLongBits(getDoubleValue())
            == java.lang.Double.doubleToLongBits(
                other.getDoubleValue()));
        break;
      case 6:
        result = result && getStringValue()
            .equals(other.getStringValue());
        break;
      case 7:
        result = result && getBytesValue()
            .equals(other.getBytesValue());
        break;
      case 0:
      default:
    }
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
    switch (constantKindCase_) {
      case 1:
        hash = (37 * hash) + NULL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getNullValueValue();
        break;
      case 2:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 3:
        hash = (37 * hash) + INT64_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getInt64Value());
        break;
      case 4:
        hash = (37 * hash) + UINT64_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getUint64Value());
        break;
      case 5:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 6:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 7:
        hash = (37 * hash) + BYTES_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getBytesValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.Literal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
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
  public static Builder newBuilder(com.google.api.expr.v1beta1.Literal prototype) {
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
   * Represents a primitive literal.
   * This is similar to the primitives supported in the well-known type
   * `google.protobuf.Value`, but richer so it can represent CEL's full range of
   * primitives.
   * Lists and structs are not included as constants as these aggregate types may
   * contain [Expr][google.api.expr.v1beta1.Expr] elements which require
   * evaluation and are thus not constant.
   * Examples of literals include: `"hello"`, `b'bytes'`, `1u`, `4.2`, `-2`,
   * `true`, `null`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1beta1.Literal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1beta1.Literal)
      com.google.api.expr.v1beta1.LiteralOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1beta1.ExprProto.internal_static_google_api_expr_v1beta1_Literal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1beta1.ExprProto.internal_static_google_api_expr_v1beta1_Literal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1beta1.Literal.class, com.google.api.expr.v1beta1.Literal.Builder.class);
    }

    // Construct using com.google.api.expr.v1beta1.Literal.newBuilder()
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
      constantKindCase_ = 0;
      constantKind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1beta1.ExprProto.internal_static_google_api_expr_v1beta1_Literal_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.Literal getDefaultInstanceForType() {
      return com.google.api.expr.v1beta1.Literal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.Literal build() {
      com.google.api.expr.v1beta1.Literal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1beta1.Literal buildPartial() {
      com.google.api.expr.v1beta1.Literal result = new com.google.api.expr.v1beta1.Literal(this);
      if (constantKindCase_ == 1) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 2) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 3) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 4) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 5) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 6) {
        result.constantKind_ = constantKind_;
      }
      if (constantKindCase_ == 7) {
        result.constantKind_ = constantKind_;
      }
      result.constantKindCase_ = constantKindCase_;
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
      if (other instanceof com.google.api.expr.v1beta1.Literal) {
        return mergeFrom((com.google.api.expr.v1beta1.Literal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1beta1.Literal other) {
      if (other == com.google.api.expr.v1beta1.Literal.getDefaultInstance()) return this;
      switch (other.getConstantKindCase()) {
        case NULL_VALUE: {
          setNullValueValue(other.getNullValueValue());
          break;
        }
        case BOOL_VALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case INT64_VALUE: {
          setInt64Value(other.getInt64Value());
          break;
        }
        case UINT64_VALUE: {
          setUint64Value(other.getUint64Value());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case STRING_VALUE: {
          constantKindCase_ = 6;
          constantKind_ = other.constantKind_;
          onChanged();
          break;
        }
        case BYTES_VALUE: {
          setBytesValue(other.getBytesValue());
          break;
        }
        case CONSTANTKIND_NOT_SET: {
          break;
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
      com.google.api.expr.v1beta1.Literal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.expr.v1beta1.Literal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int constantKindCase_ = 0;
    private java.lang.Object constantKind_;
    public ConstantKindCase
        getConstantKindCase() {
      return ConstantKindCase.forNumber(
          constantKindCase_);
    }

    public Builder clearConstantKind() {
      constantKindCase_ = 0;
      constantKind_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1;</code>
     */
    public int getNullValueValue() {
      if (constantKindCase_ == 1) {
        return ((java.lang.Integer) constantKind_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder setNullValueValue(int value) {
      constantKindCase_ = 1;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1;</code>
     */
    public com.google.protobuf.NullValue getNullValue() {
      if (constantKindCase_ == 1) {
        @SuppressWarnings("deprecation")
        com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
            (java.lang.Integer) constantKind_);
        return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
      }
      return com.google.protobuf.NullValue.NULL_VALUE;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder setNullValue(com.google.protobuf.NullValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      constantKindCase_ = 1;
      constantKind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder clearNullValue() {
      if (constantKindCase_ == 1) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2;</code>
     */
    public boolean getBoolValue() {
      if (constantKindCase_ == 2) {
        return (java.lang.Boolean) constantKind_;
      }
      return false;
    }
    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2;</code>
     */
    public Builder setBoolValue(boolean value) {
      constantKindCase_ = 2;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2;</code>
     */
    public Builder clearBoolValue() {
      if (constantKindCase_ == 2) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3;</code>
     */
    public long getInt64Value() {
      if (constantKindCase_ == 3) {
        return (java.lang.Long) constantKind_;
      }
      return 0L;
    }
    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3;</code>
     */
    public Builder setInt64Value(long value) {
      constantKindCase_ = 3;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3;</code>
     */
    public Builder clearInt64Value() {
      if (constantKindCase_ == 3) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4;</code>
     */
    public long getUint64Value() {
      if (constantKindCase_ == 4) {
        return (java.lang.Long) constantKind_;
      }
      return 0L;
    }
    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4;</code>
     */
    public Builder setUint64Value(long value) {
      constantKindCase_ = 4;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4;</code>
     */
    public Builder clearUint64Value() {
      if (constantKindCase_ == 4) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5;</code>
     */
    public double getDoubleValue() {
      if (constantKindCase_ == 5) {
        return (java.lang.Double) constantKind_;
      }
      return 0D;
    }
    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5;</code>
     */
    public Builder setDoubleValue(double value) {
      constantKindCase_ = 5;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5;</code>
     */
    public Builder clearDoubleValue() {
      if (constantKindCase_ == 5) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6;</code>
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (constantKindCase_ == 6) {
        ref = constantKind_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (constantKindCase_ == 6) {
          constantKind_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (constantKindCase_ == 6) {
        ref = constantKind_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (constantKindCase_ == 6) {
          constantKind_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6;</code>
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  constantKindCase_ = 6;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6;</code>
     */
    public Builder clearStringValue() {
      if (constantKindCase_ == 6) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      constantKindCase_ = 6;
      constantKind_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7;</code>
     */
    public com.google.protobuf.ByteString getBytesValue() {
      if (constantKindCase_ == 7) {
        return (com.google.protobuf.ByteString) constantKind_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7;</code>
     */
    public Builder setBytesValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  constantKindCase_ = 7;
      constantKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7;</code>
     */
    public Builder clearBytesValue() {
      if (constantKindCase_ == 7) {
        constantKindCase_ = 0;
        constantKind_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1beta1.Literal)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1beta1.Literal)
  private static final com.google.api.expr.v1beta1.Literal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1beta1.Literal();
  }

  public static com.google.api.expr.v1beta1.Literal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Literal>
      PARSER = new com.google.protobuf.AbstractParser<Literal>() {
    @java.lang.Override
    public Literal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Literal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Literal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Literal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1beta1.Literal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

