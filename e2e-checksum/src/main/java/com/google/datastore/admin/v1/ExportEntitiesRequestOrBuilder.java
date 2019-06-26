// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

public interface ExportEntitiesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.ExportEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Description of what data from the project is included in the export.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 3;</code>
   */
  boolean hasEntityFilter();
  /**
   * <pre>
   * Description of what data from the project is included in the export.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 3;</code>
   */
  com.google.datastore.admin.v1.EntityFilter getEntityFilter();
  /**
   * <pre>
   * Description of what data from the project is included in the export.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 3;</code>
   */
  com.google.datastore.admin.v1.EntityFilterOrBuilder getEntityFilterOrBuilder();

  /**
   * <pre>
   * Location for the export metadata and data files.
   * The full resource URL of the external storage location. Currently, only
   * Google Cloud Storage is supported. So output_url_prefix should be of the
   * form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the
   * name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional Cloud
   * Storage namespace path (this is not a Cloud Datastore namespace). For more
   * information about Cloud Storage namespace paths, see
   * [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   * The resulting files will be nested deeper than the specified URL prefix.
   * The final output URL will be provided in the
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url]
   * field. That value should be used for subsequent ImportEntities operations.
   * By nesting the data files deeper, the same Cloud Storage bucket can be used
   * in multiple ExportEntities operations without conflict.
   * </pre>
   *
   * <code>string output_url_prefix = 4;</code>
   */
  java.lang.String getOutputUrlPrefix();
  /**
   * <pre>
   * Location for the export metadata and data files.
   * The full resource URL of the external storage location. Currently, only
   * Google Cloud Storage is supported. So output_url_prefix should be of the
   * form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the
   * name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional Cloud
   * Storage namespace path (this is not a Cloud Datastore namespace). For more
   * information about Cloud Storage namespace paths, see
   * [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   * The resulting files will be nested deeper than the specified URL prefix.
   * The final output URL will be provided in the
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url]
   * field. That value should be used for subsequent ImportEntities operations.
   * By nesting the data files deeper, the same Cloud Storage bucket can be used
   * in multiple ExportEntities operations without conflict.
   * </pre>
   *
   * <code>string output_url_prefix = 4;</code>
   */
  com.google.protobuf.ByteString
      getOutputUrlPrefixBytes();
}
