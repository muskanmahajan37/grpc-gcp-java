// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

public interface EntityFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.EntityFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   */
  java.util.List<java.lang.String>
      getKindsList();
  /**
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   */
  int getKindsCount();
  /**
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   */
  java.lang.String getKinds(int index);
  /**
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   */
  com.google.protobuf.ByteString
      getKindsBytes(int index);

  /**
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   */
  java.util.List<java.lang.String>
      getNamespaceIdsList();
  /**
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   */
  int getNamespaceIdsCount();
  /**
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   */
  java.lang.String getNamespaceIds(int index);
  /**
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceIdsBytes(int index);
}
