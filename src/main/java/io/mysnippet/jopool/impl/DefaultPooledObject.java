package io.mysnippet.jopool.impl;

import io.mysnippet.jopool.PooledObject;
import io.mysnippet.jopool.assist.PooledObjectState;

import java.io.PrintWriter;

/**
 * 默认池化对象实现
 *
 * @param <T>
 */
public class DefaultPooledObject<T> implements PooledObject<T> {

  private final T object;

  public DefaultPooledObject(final T object) {
    this.object = object;
  }

  @Override
  public T getObject() {
    return object;
  }

  @Override
  public boolean allocate() {
    return false;
  }

  @Override
  public boolean deallocate() {
    return false;
  }

  @Override
  public void invalidate() {}

  @Override
  public long getCreateTime() {
    return 0;
  }

  @Override
  public long getActiveTimeMillis() {
    return 0;
  }

  @Override
  public long getIdleTimeMillis() {
    return 0;
  }

  @Override
  public long getLastBorrowTime() {
    return 0;
  }

  @Override
  public long getLastReturnTime() {
    return 0;
  }

  @Override
  public long getLastUsedTime() {
    return 0;
  }

  @Override
  public int compareTo(PooledObject<T> other) {
    return 0;
  }

  @Override
  public void setLogAbandoned(boolean logAbandoned) {}

  @Override
  public void use() {}

  @Override
  public void printStackTrace(PrintWriter writer) {}

  @Override
  public void markAbandoned() {}

  @Override
  public void markReturning() {}

  @Override
  public PooledObjectState getState() {
    return null;
  }
}
