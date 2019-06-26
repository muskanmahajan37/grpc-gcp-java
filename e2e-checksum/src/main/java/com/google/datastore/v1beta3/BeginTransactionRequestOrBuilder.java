// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface BeginTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.BeginTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.TransactionOptions transaction_options = 10;</code>
   */
  boolean hasTransactionOptions();
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.TransactionOptions transaction_options = 10;</code>
   */
  com.google.datastore.v1beta3.TransactionOptions getTransactionOptions();
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.TransactionOptions transaction_options = 10;</code>
   */
  com.google.datastore.v1beta3.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder();
}
