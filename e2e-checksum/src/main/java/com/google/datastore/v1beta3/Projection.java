// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/query.proto

package com.google.datastore.v1beta3;

/**
 * <pre>
 * A representation of a property in a projection.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1beta3.Projection}
 */
public  final class Projection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1beta3.Projection)
    ProjectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Projection.newBuilder() to construct.
  private Projection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Projection() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Projection(
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
            com.google.datastore.v1beta3.PropertyReference.Builder subBuilder = null;
            if (property_ != null) {
              subBuilder = property_.toBuilder();
            }
            property_ = input.readMessage(com.google.datastore.v1beta3.PropertyReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(property_);
              property_ = subBuilder.buildPartial();
            }

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
    return com.google.datastore.v1beta3.QueryProto.internal_static_google_datastore_v1beta3_Projection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1beta3.QueryProto.internal_static_google_datastore_v1beta3_Projection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1beta3.Projection.class, com.google.datastore.v1beta3.Projection.Builder.class);
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;
  private com.google.datastore.v1beta3.PropertyReference property_;
  /**
   * <pre>
   * The property to project.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  public boolean hasProperty() {
    return property_ != null;
  }
  /**
   * <pre>
   * The property to project.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  public com.google.datastore.v1beta3.PropertyReference getProperty() {
    return property_ == null ? com.google.datastore.v1beta3.PropertyReference.getDefaultInstance() : property_;
  }
  /**
   * <pre>
   * The property to project.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  public com.google.datastore.v1beta3.PropertyReferenceOrBuilder getPropertyOrBuilder() {
    return getProperty();
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
    if (property_ != null) {
      output.writeMessage(1, getProperty());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (property_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProperty());
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
    if (!(obj instanceof com.google.datastore.v1beta3.Projection)) {
      return super.equals(obj);
    }
    com.google.datastore.v1beta3.Projection other = (com.google.datastore.v1beta3.Projection) obj;

    boolean result = true;
    result = result && (hasProperty() == other.hasProperty());
    if (hasProperty()) {
      result = result && getProperty()
          .equals(other.getProperty());
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
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + getProperty().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1beta3.Projection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.Projection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.Projection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1beta3.Projection parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1beta3.Projection prototype) {
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
   * A representation of a property in a projection.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1beta3.Projection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1beta3.Projection)
      com.google.datastore.v1beta3.ProjectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1beta3.QueryProto.internal_static_google_datastore_v1beta3_Projection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1beta3.QueryProto.internal_static_google_datastore_v1beta3_Projection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1beta3.Projection.class, com.google.datastore.v1beta3.Projection.Builder.class);
    }

    // Construct using com.google.datastore.v1beta3.Projection.newBuilder()
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
      if (propertyBuilder_ == null) {
        property_ = null;
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1beta3.QueryProto.internal_static_google_datastore_v1beta3_Projection_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.Projection getDefaultInstanceForType() {
      return com.google.datastore.v1beta3.Projection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.Projection build() {
      com.google.datastore.v1beta3.Projection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1beta3.Projection buildPartial() {
      com.google.datastore.v1beta3.Projection result = new com.google.datastore.v1beta3.Projection(this);
      if (propertyBuilder_ == null) {
        result.property_ = property_;
      } else {
        result.property_ = propertyBuilder_.build();
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
      if (other instanceof com.google.datastore.v1beta3.Projection) {
        return mergeFrom((com.google.datastore.v1beta3.Projection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1beta3.Projection other) {
      if (other == com.google.datastore.v1beta3.Projection.getDefaultInstance()) return this;
      if (other.hasProperty()) {
        mergeProperty(other.getProperty());
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
      com.google.datastore.v1beta3.Projection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1beta3.Projection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.datastore.v1beta3.PropertyReference property_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1beta3.PropertyReference, com.google.datastore.v1beta3.PropertyReference.Builder, com.google.datastore.v1beta3.PropertyReferenceOrBuilder> propertyBuilder_;
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public boolean hasProperty() {
      return propertyBuilder_ != null || property_ != null;
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1beta3.PropertyReference getProperty() {
      if (propertyBuilder_ == null) {
        return property_ == null ? com.google.datastore.v1beta3.PropertyReference.getDefaultInstance() : property_;
      } else {
        return propertyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public Builder setProperty(com.google.datastore.v1beta3.PropertyReference value) {
      if (propertyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        property_ = value;
        onChanged();
      } else {
        propertyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public Builder setProperty(
        com.google.datastore.v1beta3.PropertyReference.Builder builderForValue) {
      if (propertyBuilder_ == null) {
        property_ = builderForValue.build();
        onChanged();
      } else {
        propertyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public Builder mergeProperty(com.google.datastore.v1beta3.PropertyReference value) {
      if (propertyBuilder_ == null) {
        if (property_ != null) {
          property_ =
            com.google.datastore.v1beta3.PropertyReference.newBuilder(property_).mergeFrom(value).buildPartial();
        } else {
          property_ = value;
        }
        onChanged();
      } else {
        propertyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public Builder clearProperty() {
      if (propertyBuilder_ == null) {
        property_ = null;
        onChanged();
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1beta3.PropertyReference.Builder getPropertyBuilder() {
      
      onChanged();
      return getPropertyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1beta3.PropertyReferenceOrBuilder getPropertyOrBuilder() {
      if (propertyBuilder_ != null) {
        return propertyBuilder_.getMessageOrBuilder();
      } else {
        return property_ == null ?
            com.google.datastore.v1beta3.PropertyReference.getDefaultInstance() : property_;
      }
    }
    /**
     * <pre>
     * The property to project.
     * </pre>
     *
     * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1beta3.PropertyReference, com.google.datastore.v1beta3.PropertyReference.Builder, com.google.datastore.v1beta3.PropertyReferenceOrBuilder> 
        getPropertyFieldBuilder() {
      if (propertyBuilder_ == null) {
        propertyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1beta3.PropertyReference, com.google.datastore.v1beta3.PropertyReference.Builder, com.google.datastore.v1beta3.PropertyReferenceOrBuilder>(
                getProperty(),
                getParentForChildren(),
                isClean());
        property_ = null;
      }
      return propertyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.datastore.v1beta3.Projection)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1beta3.Projection)
  private static final com.google.datastore.v1beta3.Projection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1beta3.Projection();
  }

  public static com.google.datastore.v1beta3.Projection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Projection>
      PARSER = new com.google.protobuf.AbstractParser<Projection>() {
    @java.lang.Override
    public Projection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Projection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Projection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Projection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1beta3.Projection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

