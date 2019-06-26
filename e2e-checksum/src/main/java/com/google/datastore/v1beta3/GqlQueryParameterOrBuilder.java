// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/query.proto

package com.google.datastore.v1beta3;

public interface GqlQueryParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.GqlQueryParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A value parameter.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 2;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * A value parameter.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 2;</code>
   */
  com.google.datastore.v1beta3.Value getValue();
  /**
   * <pre>
   * A value parameter.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 2;</code>
   */
  com.google.datastore.v1beta3.ValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * A query cursor. Query cursors are returned in query
   * result batches.
   * </pre>
   *
   * <code>bytes cursor = 3;</code>
   */
  com.google.protobuf.ByteString getCursor();

  public com.google.datastore.v1beta3.GqlQueryParameter.ParameterTypeCase getParameterTypeCase();
}
