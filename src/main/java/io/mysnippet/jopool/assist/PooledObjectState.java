package io.mysnippet.jopool.assist;

public enum PooledObjectState {
  IDLE,
  ALLOCATED,
  EVICTION,
  EVICTION_RETURN_TO_HEAD,
  INVALID,
  ABANDONED,
  RETURNING
}
