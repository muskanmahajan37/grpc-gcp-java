// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/eval.proto

package com.google.api.expr.v1alpha1;

public interface ExprValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.ExprValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A concrete value.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Value value = 1;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * A concrete value.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Value value = 1;</code>
   */
  com.google.api.expr.v1alpha1.Value getValue();
  /**
   * <pre>
   * A concrete value.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Value value = 1;</code>
   */
  com.google.api.expr.v1alpha1.ValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * The set of errors in the critical path of evalution.
   * Only errors in the critical path are included. For example,
   * `(&lt;error1&gt; || true) &amp;&amp; &lt;error2&gt;` will only result in `&lt;error2&gt;`,
   * while `&lt;error1&gt; || &lt;error2&gt;` will result in both `&lt;error1&gt;` and
   * `&lt;error2&gt;`.
   * Errors cause by the presence of other errors are not included in the
   * set. For example `&lt;error1&gt;.foo`, `foo(&lt;error1&gt;)`, and `&lt;error1&gt; + 1` will
   * only result in `&lt;error1&gt;`.
   * Multiple errors *might* be included when evaluation could result
   * in different errors. For example `&lt;error1&gt; + &lt;error2&gt;` and
   * `foo(&lt;error1&gt;, &lt;error2&gt;)` may result in `&lt;error1&gt;`, `&lt;error2&gt;` or both.
   * The exact subset of errors included for this case is unspecified and
   * depends on the implementation details of the evaluator.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ErrorSet error = 2;</code>
   */
  boolean hasError();
  /**
   * <pre>
   * The set of errors in the critical path of evalution.
   * Only errors in the critical path are included. For example,
   * `(&lt;error1&gt; || true) &amp;&amp; &lt;error2&gt;` will only result in `&lt;error2&gt;`,
   * while `&lt;error1&gt; || &lt;error2&gt;` will result in both `&lt;error1&gt;` and
   * `&lt;error2&gt;`.
   * Errors cause by the presence of other errors are not included in the
   * set. For example `&lt;error1&gt;.foo`, `foo(&lt;error1&gt;)`, and `&lt;error1&gt; + 1` will
   * only result in `&lt;error1&gt;`.
   * Multiple errors *might* be included when evaluation could result
   * in different errors. For example `&lt;error1&gt; + &lt;error2&gt;` and
   * `foo(&lt;error1&gt;, &lt;error2&gt;)` may result in `&lt;error1&gt;`, `&lt;error2&gt;` or both.
   * The exact subset of errors included for this case is unspecified and
   * depends on the implementation details of the evaluator.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ErrorSet error = 2;</code>
   */
  com.google.api.expr.v1alpha1.ErrorSet getError();
  /**
   * <pre>
   * The set of errors in the critical path of evalution.
   * Only errors in the critical path are included. For example,
   * `(&lt;error1&gt; || true) &amp;&amp; &lt;error2&gt;` will only result in `&lt;error2&gt;`,
   * while `&lt;error1&gt; || &lt;error2&gt;` will result in both `&lt;error1&gt;` and
   * `&lt;error2&gt;`.
   * Errors cause by the presence of other errors are not included in the
   * set. For example `&lt;error1&gt;.foo`, `foo(&lt;error1&gt;)`, and `&lt;error1&gt; + 1` will
   * only result in `&lt;error1&gt;`.
   * Multiple errors *might* be included when evaluation could result
   * in different errors. For example `&lt;error1&gt; + &lt;error2&gt;` and
   * `foo(&lt;error1&gt;, &lt;error2&gt;)` may result in `&lt;error1&gt;`, `&lt;error2&gt;` or both.
   * The exact subset of errors included for this case is unspecified and
   * depends on the implementation details of the evaluator.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ErrorSet error = 2;</code>
   */
  com.google.api.expr.v1alpha1.ErrorSetOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The set of unknowns in the critical path of evaluation.
   * Unknown behaves identically to Error with regards to propagation.
   * Specifically, only unknowns in the critical path are included, unknowns
   * caused by the presence of other unknowns are not included, and multiple
   * unknowns *might* be included included when evaluation could result in
   * different unknowns. For example:
   *     (&lt;unknown[1]&gt; || true) &amp;&amp; &lt;unknown[2]&gt; -&gt; &lt;unknown[2]&gt;
   *     &lt;unknown[1]&gt; || &lt;unknown[2]&gt; -&gt; &lt;unknown[1,2]&gt;
   *     &lt;unknown[1]&gt;.foo -&gt; &lt;unknown[1]&gt;
   *     foo(&lt;unknown[1]&gt;) -&gt; &lt;unknown[1]&gt;
   *     &lt;unknown[1]&gt; + &lt;unknown[2]&gt; -&gt; &lt;unknown[1]&gt; or &lt;unknown[2[&gt;
   * Unknown takes precidence over Error in cases where a `Value` can short
   * circuit the result:
   *     &lt;error&gt; || &lt;unknown&gt; -&gt; &lt;unknown&gt;
   *     &lt;error&gt; &amp;&amp; &lt;unknown&gt; -&gt; &lt;unknown&gt;
   * Errors take precidence in all other cases:
   *     &lt;unknown&gt; + &lt;error&gt; -&gt; &lt;error&gt;
   *     foo(&lt;unknown&gt;, &lt;error&gt;) -&gt; &lt;error&gt;
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.UnknownSet unknown = 3;</code>
   */
  boolean hasUnknown();
  /**
   * <pre>
   * The set of unknowns in the critical path of evaluation.
   * Unknown behaves identically to Error with regards to propagation.
   * Specifically, only unknowns in the critical path are included, unknowns
   * caused by the presence of other unknowns are not included, and multiple
   * unknowns *might* be included included when evaluation could result in
   * different unknowns. For example:
   *     (&lt;unknown[1]&gt; || true) &amp;&amp; &lt;unknown[2]&gt; -&gt; &lt;unknown[2]&gt;
   *     &lt;unknown[1]&gt; || &lt;unknown[2]&gt; -&gt; &lt;unknown[1,2]&gt;
   *     &lt;unknown[1]&gt;.foo -&gt; &lt;unknown[1]&gt;
   *     foo(&lt;unknown[1]&gt;) -&gt; &lt;unknown[1]&gt;
   *     &lt;unknown[1]&gt; + &lt;unknown[2]&gt; -&gt; &lt;unknown[1]&gt; or &lt;unknown[2[&gt;
   * Unknown takes precidence over Error in cases where a `Value` can short
   * circuit the result:
   *     &lt;error&gt; || &lt;unknown&gt; -&gt; &lt;unknown&gt;
   *     &lt;error&gt; &amp;&amp; &lt;unknown&gt; -&gt; &lt;unknown&gt;
   * Errors take precidence in all other cases:
   *     &lt;unknown&gt; + &lt;error&gt; -&gt; &lt;error&gt;
   *     foo(&lt;unknown&gt;, &lt;error&gt;) -&gt; &lt;error&gt;
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.UnknownSet unknown = 3;</code>
   */
  com.google.api.expr.v1alpha1.UnknownSet getUnknown();
  /**
   * <pre>
   * The set of unknowns in the critical path of evaluation.
   * Unknown behaves identically to Error with regards to propagation.
   * Specifically, only unknowns in the critical path are included, unknowns
   * caused by the presence of other unknowns are not included, and multiple
   * unknowns *might* be included included when evaluation could result in
   * different unknowns. For example:
   *     (&lt;unknown[1]&gt; || true) &amp;&amp; &lt;unknown[2]&gt; -&gt; &lt;unknown[2]&gt;
   *     &lt;unknown[1]&gt; || &lt;unknown[2]&gt; -&gt; &lt;unknown[1,2]&gt;
   *     &lt;unknown[1]&gt;.foo -&gt; &lt;unknown[1]&gt;
   *     foo(&lt;unknown[1]&gt;) -&gt; &lt;unknown[1]&gt;
   *     &lt;unknown[1]&gt; + &lt;unknown[2]&gt; -&gt; &lt;unknown[1]&gt; or &lt;unknown[2[&gt;
   * Unknown takes precidence over Error in cases where a `Value` can short
   * circuit the result:
   *     &lt;error&gt; || &lt;unknown&gt; -&gt; &lt;unknown&gt;
   *     &lt;error&gt; &amp;&amp; &lt;unknown&gt; -&gt; &lt;unknown&gt;
   * Errors take precidence in all other cases:
   *     &lt;unknown&gt; + &lt;error&gt; -&gt; &lt;error&gt;
   *     foo(&lt;unknown&gt;, &lt;error&gt;) -&gt; &lt;error&gt;
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.UnknownSet unknown = 3;</code>
   */
  com.google.api.expr.v1alpha1.UnknownSetOrBuilder getUnknownOrBuilder();

  public com.google.api.expr.v1alpha1.ExprValue.KindCase getKindCase();
}
