package nikolai.concurrency.threads;

public class HelloRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Hello Fucking World");
  }

  public static void main(String[] args) {
    new Thread(new HelloRunnable()).start();
  }

}
