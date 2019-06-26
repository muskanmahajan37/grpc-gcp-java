// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface DisableServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.DisableServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the service to disable. Specifying an unknown service name
   * will cause the request to fail.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * Name of the service to disable. Specifying an unknown service name
   * will cause the request to fail.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * The identity of consumer resource which service disablement will be
   * applied to.
   * The Google Service Management implementation accepts the following
   * forms:
   * - "project:&lt;project_id&gt;"
   * Note: this is made compatible with
   * google.api.servicecontrol.v1.Operation.consumer_id.
   * </pre>
   *
   * <code>string consumer_id = 2;</code>
   */
  java.lang.String getConsumerId();
  /**
   * <pre>
   * The identity of consumer resource which service disablement will be
   * applied to.
   * The Google Service Management implementation accepts the following
   * forms:
   * - "project:&lt;project_id&gt;"
   * Note: this is made compatible with
   * google.api.servicecontrol.v1.Operation.consumer_id.
   * </pre>
   *
   * <code>string consumer_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getConsumerIdBytes();
}
