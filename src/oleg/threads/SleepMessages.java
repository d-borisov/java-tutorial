package oleg.threads;

public class SleepMessages {

  public static void main(String args[]) throws InterruptedException {

    final String importantInfo[] = {
        "Mares eat oats",
        "Does eat oats",
        "Little lambs eat ivy",
        "A kid will eat ivy too"
    };

    for (String anImportantInfo : importantInfo) {
      Thread.sleep(4000);
      System.out.println(anImportantInfo);
    }
  }
}
