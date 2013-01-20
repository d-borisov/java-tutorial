package oleg.threads;

import static oleg.util.Util.print;
import static oleg.util.Util.silentSleep;

public class ThisSynchronized {

  static class InstanceCheck {
    Object lock = new Object();

    public synchronized void foo() {
      print("enter foo");
      print5times("foo");
      print("leave foo");
    }

    public void bar() {
      print("enter bar");
      synchronized (this) {
        print5times("bar");
      }
      print("leave bar");
    }

    public void qwe() {
      print("enter qwe");
      synchronized (lock) {
        print5times("qwe");
      }
      print("leave qwe");
    }
  }

  private static void print5times(final String word) {
    for (int i = 0; i < 5; i++) {
      System.out.println(word + "ing... " + i);
      silentSleep(1000);
    }
  }

  public static void main(String[] args) {
    final InstanceCheck instanceCheck = new InstanceCheck();
    new Thread() {
      @Override
      public void run() {
        instanceCheck.foo();
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        instanceCheck.bar();
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        instanceCheck.qwe();
      }
    }.start();
  }
}



