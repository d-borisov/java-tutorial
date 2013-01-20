package oleg.threads;

import static oleg.util.Util.print;
import static oleg.util.Util.silentSleep;

public class WhoIsSynchronized {

  static class StaticCheck {
    public static synchronized void foo() {
      print("enter foo");
      print5times("foo");
      print("leave foo");
    }

    public static void bar() {
      print("enter bar");
      synchronized (StaticCheck.class) {
        print5times("bar");
      }
      print("leave bar");
    }

    public static void qwe() {
      print("enter qwe");
      synchronized (WhoIsSynchronized.class) {
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
    new Thread() {
      @Override
      public void run() {
        StaticCheck.foo();
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        StaticCheck.bar();
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        StaticCheck.qwe();
      }
    }.start();
  }
}



