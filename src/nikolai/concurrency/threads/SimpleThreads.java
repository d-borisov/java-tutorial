package nikolai.concurrency.threads;

import static java.lang.Thread.sleep;

public class SimpleThreads {
  static void threadMessage(String message) {
    String threadName = Thread.currentThread().getName();
    System.out.printf("%s: %s%n", threadName, message);
  }

  private static class MessageLoop implements Runnable {
    @Override
    public void run() {
      String message[] = {
          "Here the list ",
          "of side effects",
          "practice tested",
          "Covering every malice angle",
          "For example you will sleep forever",
          "You will never sleep again"
      };

      for (int i = 0; i < message.length; i++) {
        try {
          sleep(4000);
        } catch (InterruptedException e) {
          return;
        }
        threadMessage(message[i]);
      }
    }

    public static void main(String[] args) throws InterruptedException {
      long patience = 1000 * 60 * 60;

      threadMessage("Starting Message Loop");
      long startTime = System.currentTimeMillis();
      Thread t = new Thread(new MessageLoop());
      t.start();

      threadMessage("Waiting Message Loop to finish");
      while (t.isAlive()) {
        threadMessage("Waiting...");
        t.join(1000);

        if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
          threadMessage("tired of waiting");
          t.interrupt();
          t.join();
        }

      }
      threadMessage("Finally");
    }
  }
}
