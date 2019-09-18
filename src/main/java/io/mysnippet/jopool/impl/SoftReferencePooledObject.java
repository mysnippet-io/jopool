package io.mysnippet.jopool.impl;

public class SoftReferencePooledObject<T> extends DefaultPooledObject<T> {

    public SoftReferencePooledObject(T object) {
        super(object);
    }
}

