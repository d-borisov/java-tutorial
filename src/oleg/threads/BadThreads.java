package oleg.threads;

import static oleg.util.Util.silentSleep;

public class BadThreads {
  static String message;

  private static class CorrectorThread extends Thread {
    public void run() {
      silentSleep(1000);
      message = "Mares do eat oats.";
    }
  }

  public static void main(String args[]) {
    new CorrectorThread().start();

    message = "Mares do not eat oats.";
    silentSleep(2000);

    System.out.println(message);
  }
}