package io.mysnippet.jopool.impl;

import io.mysnippet.jopool.BaseObjectPool;

public class SoftReferenceObjectPool<T> extends BaseObjectPool<T> {

  @Override
  public T borrowObject() {
    assertOpen();
    T obj = null;
    boolean newlyCreated = false;




    return null;
  }

  @Override
  public void returnObject(T obj) {}

  @Override
  public void invalidateObject(T obj) {}
}
