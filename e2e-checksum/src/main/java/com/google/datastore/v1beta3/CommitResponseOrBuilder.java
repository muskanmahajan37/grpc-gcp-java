// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface CommitResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.CommitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.MutationResult mutation_results = 3;</code>
   */
  java.util.List<com.google.datastore.v1beta3.MutationResult> 
      getMutationResultsList();
  /**
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.MutationResult mutation_results = 3;</code>
   */
  com.google.datastore.v1beta3.MutationResult getMutationResults(int index);
  /**
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.MutationResult mutation_results = 3;</code>
   */
  int getMutationResultsCount();
  /**
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.MutationResult mutation_results = 3;</code>
   */
  java.util.List<? extends com.google.datastore.v1beta3.MutationResultOrBuilder> 
      getMutationResultsOrBuilderList();
  /**
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.MutationResult mutation_results = 3;</code>
   */
  com.google.datastore.v1beta3.MutationResultOrBuilder getMutationResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The number of index entries updated during the commit, or zero if none were
   * updated.
   * </pre>
   *
   * <code>int32 index_updates = 4;</code>
   */
  int getIndexUpdates();
}
