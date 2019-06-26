// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

public interface CheckResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.CheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The same operation_id value used in the
   * [CheckRequest][google.api.servicecontrol.v1.CheckRequest]. Used for logging
   * and diagnostics purposes.
   * </pre>
   *
   * <code>string operation_id = 1;</code>
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * The same operation_id value used in the
   * [CheckRequest][google.api.servicecontrol.v1.CheckRequest]. Used for logging
   * and diagnostics purposes.
   * </pre>
   *
   * <code>string operation_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * The current service rollout id used to process the request.
   * </pre>
   *
   * <code>string service_rollout_id = 11;</code>
   */
  java.lang.String getServiceRolloutId();
  /**
   * <pre>
   * The current service rollout id used to process the request.
   * </pre>
   *
   * <code>string service_rollout_id = 11;</code>
   */
  com.google.protobuf.ByteString
      getServiceRolloutIdBytes();

  /**
   * <pre>
   * Indicate the decision of the check.
   * If no check errors are present, the service should process the operation.
   * Otherwise the service should use the list of errors to determine the
   * appropriate action.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.CheckError check_errors = 2;</code>
   */
  java.util.List<com.google.api.servicecontrol.v1.CheckError> 
      getCheckErrorsList();
  /**
   * <pre>
   * Indicate the decision of the check.
   * If no check errors are present, the service should process the operation.
   * Otherwise the service should use the list of errors to determine the
   * appropriate action.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.CheckError check_errors = 2;</code>
   */
  com.google.api.servicecontrol.v1.CheckError getCheckErrors(int index);
  /**
   * <pre>
   * Indicate the decision of the check.
   * If no check errors are present, the service should process the operation.
   * Otherwise the service should use the list of errors to determine the
   * appropriate action.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.CheckError check_errors = 2;</code>
   */
  int getCheckErrorsCount();
  /**
   * <pre>
   * Indicate the decision of the check.
   * If no check errors are present, the service should process the operation.
   * Otherwise the service should use the list of errors to determine the
   * appropriate action.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.CheckError check_errors = 2;</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v1.CheckErrorOrBuilder> 
      getCheckErrorsOrBuilderList();
  /**
   * <pre>
   * Indicate the decision of the check.
   * If no check errors are present, the service should process the operation.
   * Otherwise the service should use the list of errors to determine the
   * appropriate action.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.CheckError check_errors = 2;</code>
   */
  com.google.api.servicecontrol.v1.CheckErrorOrBuilder getCheckErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * The actual config id used to process the request.
   * </pre>
   *
   * <code>string service_config_id = 5;</code>
   */
  java.lang.String getServiceConfigId();
  /**
   * <pre>
   * The actual config id used to process the request.
   * </pre>
   *
   * <code>string service_config_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getServiceConfigIdBytes();

  /**
   * <pre>
   * Feedback data returned from the server during processing a Check request.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.CheckResponse.CheckInfo check_info = 6;</code>
   */
  boolean hasCheckInfo();
  /**
   * <pre>
   * Feedback data returned from the server during processing a Check request.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.CheckResponse.CheckInfo check_info = 6;</code>
   */
  com.google.api.servicecontrol.v1.CheckResponse.CheckInfo getCheckInfo();
  /**
   * <pre>
   * Feedback data returned from the server during processing a Check request.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.CheckResponse.CheckInfo check_info = 6;</code>
   */
  com.google.api.servicecontrol.v1.CheckResponse.CheckInfoOrBuilder getCheckInfoOrBuilder();
}
