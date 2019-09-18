package io.mysnippet.jopool.impl;

public class TT {

  int i = 0;

  public static void main(String[] args) {
    //
    TT tt = new TT();
    tt.clear();
  }

  public void clear() {
    while (poll() != null) ;
  }

  public Object poll() {
    System.out.println(i++);
    return true;
  }
}
