package io.mysnippet.jopool.assist;

public abstract class Object {

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append(getClass().getSimpleName());
    builder.append(" [");
    toStringAppendFields(builder);
    builder.append("]");
    return builder.toString();
  }

  protected void toStringAppendFields(final StringBuilder builder) {
    // do nothing by default, needed for b/w compatibility.
  }
}
