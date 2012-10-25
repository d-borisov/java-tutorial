package oleg.threads;

public class Sleep {

  public static void main(String[] args) {

    final Thread inner = new Thread() {
      @Override
      public void run() {
        try {
          Thread.sleep(10000);
        } catch (InterruptedException e) {
          System.out.println("=/");
        }
      }
    };

    inner.start();
    System.out.println(inner.isInterrupted());
    inner.interrupt();
    System.out.println(inner.isInterrupted());
  }

}
