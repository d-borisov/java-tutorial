package nikolai.concurrency.threads;

public class HelloThread extends Thread {

  @Override
  public void run() {
    System.out.println("hello thread");
  }

  public static void main(String[] args) {
    new HelloThread().start();
  }
}
