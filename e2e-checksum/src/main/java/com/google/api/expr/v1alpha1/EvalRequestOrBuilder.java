// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/conformance_service.proto

package com.google.api.expr.v1alpha1;

public interface EvalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.EvalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Evaluate based on the parsed representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  boolean hasParsedExpr();
  /**
   * <pre>
   * Evaluate based on the parsed representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  com.google.api.expr.v1alpha1.ParsedExpr getParsedExpr();
  /**
   * <pre>
   * Evaluate based on the parsed representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  com.google.api.expr.v1alpha1.ParsedExprOrBuilder getParsedExprOrBuilder();

  /**
   * <pre>
   * Evaluate based on the checked representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.CheckedExpr checked_expr = 2;</code>
   */
  boolean hasCheckedExpr();
  /**
   * <pre>
   * Evaluate based on the checked representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.CheckedExpr checked_expr = 2;</code>
   */
  com.google.api.expr.v1alpha1.CheckedExpr getCheckedExpr();
  /**
   * <pre>
   * Evaluate based on the checked representation.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.CheckedExpr checked_expr = 2;</code>
   */
  com.google.api.expr.v1alpha1.CheckedExprOrBuilder getCheckedExprOrBuilder();

  /**
   * <pre>
   * Bindings for the external variables.  The types SHOULD be compatible
   * with the type environment in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>map&lt;string, .google.api.expr.v1alpha1.ExprValue&gt; bindings = 3;</code>
   */
  int getBindingsCount();
  /**
   * <pre>
   * Bindings for the external variables.  The types SHOULD be compatible
   * with the type environment in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>map&lt;string, .google.api.expr.v1alpha1.ExprValue&gt; bindings = 3;</code>
   */
  boolean containsBindings(
      java.lang.String key);
  /**
   * Use {@link #getBindingsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.api.expr.v1alpha1.ExprValue>
  getBindings();
  /**
   * <pre>
   * Bindings for the external variables.  The types SHOULD be compatible
   * with the type environment in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>map&lt;string, .google.api.expr.v1alpha1.ExprValue&gt; bindings = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.api.expr.v1alpha1.ExprValue>
  getBindingsMap();
  /**
   * <pre>
   * Bindings for the external variables.  The types SHOULD be compatible
   * with the type environment in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>map&lt;string, .google.api.expr.v1alpha1.ExprValue&gt; bindings = 3;</code>
   */

  com.google.api.expr.v1alpha1.ExprValue getBindingsOrDefault(
      java.lang.String key,
      com.google.api.expr.v1alpha1.ExprValue defaultValue);
  /**
   * <pre>
   * Bindings for the external variables.  The types SHOULD be compatible
   * with the type environment in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>map&lt;string, .google.api.expr.v1alpha1.ExprValue&gt; bindings = 3;</code>
   */

  com.google.api.expr.v1alpha1.ExprValue getBindingsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * SHOULD be the same container as used in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>string container = 4;</code>
   */
  java.lang.String getContainer();
  /**
   * <pre>
   * SHOULD be the same container as used in
   * [CheckRequest][google.api.expr.v1alpha1.CheckRequest], if checked.
   * </pre>
   *
   * <code>string container = 4;</code>
   */
  com.google.protobuf.ByteString
      getContainerBytes();

  public com.google.api.expr.v1alpha1.EvalRequest.ExprKindCase getExprKindCase();
}
