package io.mysnippet.jopool;

import io.mysnippet.jopool.assist.PooledObjectState;

import java.io.PrintWriter;

/**
 * 池化对象
 *
 * @param <T>
 */
public interface PooledObject<T> extends Comparable<PooledObject<T>> {

  T getObject();

  boolean allocate();

  boolean deallocate();

  void invalidate();

  long getCreateTime();

  long getActiveTimeMillis();

  long getIdleTimeMillis();

  long getLastBorrowTime();

  long getLastReturnTime();

  long getLastUsedTime();

  default long getBorrowedCount() {
    return -1;
  }

  @Override
  int compareTo(PooledObject<T> other);

  @Override
  boolean equals(Object obj);

  @Override
  int hashCode();

  @Override
  String toString();

  void setLogAbandoned(boolean logAbandoned);

  default void setRequireFullStackTrace(boolean requireFullStackTrace) {
    // noop
  }

  void use();

  void printStackTrace(PrintWriter writer);

  void markAbandoned();

  void markReturning();

  PooledObjectState getState();
}
