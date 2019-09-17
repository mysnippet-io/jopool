package io.mysnippet.jopool;

import java.io.Closeable;
import java.util.NoSuchElementException;

public interface ObjectPool<T> extends Closeable {

  T borrowObject() throws Exception, NoSuchElementException, IllegalStateException;;

  void returnObject(T obj) throws Exception;;

  void invalidateObject(T obj) throws Exception;;

  void addObject() throws Exception, IllegalStateException, UnsupportedOperationException;;

  void clear() throws Exception, UnsupportedOperationException;;

  int getNumIdle();

  int getNumActive();

  @Override
  void close();
}
