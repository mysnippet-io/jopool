package io.mysnippet.jopool;

import io.mysnippet.jopool.assist.Object;

public abstract class BaseObjectPool<T> extends Object implements ObjectPool<T> {

  private volatile boolean closed = false;

  @Override
  public abstract T borrowObject();

  @Override
  public abstract void returnObject(T obj);

  @Override
  public abstract void invalidateObject(T obj);

  @Override
  public int getNumIdle() {
    return -1;
  }

  @Override
  public int getNumActive() {
    return -1;
  }

  @Override
  public void clear() throws Exception, UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  @Override
  public void addObject() throws Exception, UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  @Override
  public void close() {
    closed = true;
  }

  public final boolean isClosed() {
    return closed;
  }

  protected final void assertOpen() throws IllegalStateException {
    if (isClosed()) {
      throw new IllegalStateException("Pool not open!");
    }
  }

  @Override
  protected void toStringAppendFields(final StringBuilder builder) {
    builder.append("closed=");
    builder.append(closed);
  }
}
