package oleg.util;

final public class Util {
  public static void print(String message) {
    System.out.println(message);
  }

  public static void silentSleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
