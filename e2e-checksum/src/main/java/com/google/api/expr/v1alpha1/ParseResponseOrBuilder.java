// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/conformance_service.proto

package com.google.api.expr.v1alpha1;

public interface ParseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.ParseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parsed representation, or unset if parsing failed.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  boolean hasParsedExpr();
  /**
   * <pre>
   * The parsed representation, or unset if parsing failed.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  com.google.api.expr.v1alpha1.ParsedExpr getParsedExpr();
  /**
   * <pre>
   * The parsed representation, or unset if parsing failed.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr parsed_expr = 1;</code>
   */
  com.google.api.expr.v1alpha1.ParsedExprOrBuilder getParsedExprOrBuilder();

  /**
   * <pre>
   * Any number of issues with [StatusDetails][] as the details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status issues = 2;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getIssuesList();
  /**
   * <pre>
   * Any number of issues with [StatusDetails][] as the details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status issues = 2;</code>
   */
  com.google.rpc.Status getIssues(int index);
  /**
   * <pre>
   * Any number of issues with [StatusDetails][] as the details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status issues = 2;</code>
   */
  int getIssuesCount();
  /**
   * <pre>
   * Any number of issues with [StatusDetails][] as the details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status issues = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getIssuesOrBuilderList();
  /**
   * <pre>
   * Any number of issues with [StatusDetails][] as the details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status issues = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getIssuesOrBuilder(
      int index);
}
