package io.mysnippet.jopool.impl;

import io.mysnippet.jopool.BaseObjectPool;
import io.mysnippet.jopool.PooledObjectFactory;

public class SoftReferenceObjectPool<T> extends BaseObjectPool<T> {

    private PooledObjectFactory<T> factory;

    public SoftReferenceObjectPool(final PooledObjectFactory<T> factory) {
        this.factory = factory;
    }

    @Override
    public T borrowObject() {
        assertOpen();
        T obj = null;
        boolean newlyCreated = false;
        SoftReferencePooledObject<T> softRef = null;


        return null;
    }

    @Override
    public void returnObject(T obj) {
    }

    @Override
    public void invalidateObject(T obj) {
    }
}
