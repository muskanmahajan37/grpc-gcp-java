// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

public interface ResourceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *   message Subscription {
   *     string topic = 2 [(google.api.resource_reference) = {
   *       type = "pubsub.googleapis.com/Topic"
   *     }];
   *   }
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *   message Subscription {
   *     string topic = 2 [(google.api.resource_reference) = {
   *       type = "pubsub.googleapis.com/Topic"
   *     }];
   *   }
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for `parent` fields where a resource has more
   * than one possible type of parent.
   * Example:
   *   message ListLogEntriesRequest {
   *     string parent = 1 [(google.api.resource_reference) = {
   *       child_type: "logging.googleapis.com/LogEntry"
   *     };
   *   }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   */
  java.lang.String getChildType();
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for `parent` fields where a resource has more
   * than one possible type of parent.
   * Example:
   *   message ListLogEntriesRequest {
   *     string parent = 1 [(google.api.resource_reference) = {
   *       child_type: "logging.googleapis.com/LogEntry"
   *     };
   *   }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getChildTypeBytes();
}
