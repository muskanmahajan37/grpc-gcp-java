// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/query.proto

package com.google.datastore.v1beta3;

public interface PropertyFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.PropertyFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  boolean hasProperty();
  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  com.google.datastore.v1beta3.PropertyReference getProperty();
  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyReference property = 1;</code>
   */
  com.google.datastore.v1beta3.PropertyReferenceOrBuilder getPropertyOrBuilder();

  /**
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyFilter.Operator op = 2;</code>
   */
  int getOpValue();
  /**
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PropertyFilter.Operator op = 2;</code>
   */
  com.google.datastore.v1beta3.PropertyFilter.Operator getOp();

  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 3;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 3;</code>
   */
  com.google.datastore.v1beta3.Value getValue();
  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Value value = 3;</code>
   */
  com.google.datastore.v1beta3.ValueOrBuilder getValueOrBuilder();
}
