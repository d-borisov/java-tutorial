package oleg.threads;

public class SimpleThreads {

  public static void main(String args[]) throws InterruptedException {
    final long patience = getPatience(args);
    message("Starting MessageLoop thread");
    long startTime = System.currentTimeMillis();

    Thread t = new Thread(new MessageLoop());
    t.start();

    message("Waiting for MessageLoop thread to finish");

    while (t.isAlive()) {
      message("Still waiting...");
      t.join(1000);

      if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
        message("Tired of waiting!");
        t.interrupt();
        t.join();
      }
    }
    message("Finally!");
  }

  private static long getPatience(String[] args) {
    if (args.length > 0) {
      try {
        return Long.parseLong(args[0]) * 1000;
      } catch (NumberFormatException e) {
        System.err.println("Argument must be an integer.");
        System.exit(1);
      }
    }
    return (long) (1000 * 60 * 60);
  }


  private static class MessageLoop implements Runnable {

    public void run() {

      String importantInfo[] = {
          "Mares eat oats",
          "Does eat oats",
          "Little lambs eat ivy",
          "A kid will eat ivy too"
      };
      try {
        for (String info : importantInfo) {
          Thread.sleep(4000);
          message(info);
        }
      } catch (InterruptedException e) {
        message("I wasn't done!");
      }
    }
  }

  static void message(String message) {
    String threadName = Thread.currentThread().getName();
    System.out.format("%s: %s%n", threadName, message);
  }

}

