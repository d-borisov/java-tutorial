package oleg.threads;

public class Interrupt {
  public static void main(String[] args) {
    final String importantInfo[] = {
        "Mares eat oats",
        "Does eat oats",
        "Little lambs eat ivy",
        "A kid will eat ivy too"
    };

    for (String anImportantInfo : importantInfo) {
      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {
        return;
      }
      System.out.println(anImportantInfo);
    }

    for (String anImportantInfo : importantInfo) {
      if (Thread.interrupted()) {
        return;
      }
    }

    try {
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
    } catch (InterruptedException e) {
    }

  }
}
