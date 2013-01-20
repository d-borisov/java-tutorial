package nikolai.concurrency.syncronization;

public class SynchronizedMethods {

  public static int threads() throws InterruptedException {
    final SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

    Thread a = new Thread() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " value before is: " + synchronizedCounter.value());
        for (int i = 0; i < 10000000; i++) {
          synchronizedCounter.decrement();
        }
        System.out.println(Thread.currentThread().getName() + " value after is: " + synchronizedCounter.value());
      }
    };

    Thread b = new Thread() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " value before is: " + synchronizedCounter.value());
        for (int i = 0; i < 10000000; i++) {
          synchronizedCounter.increment();
        }
        System.out.println(Thread.currentThread().getName() + " value after is: " + synchronizedCounter.value());
      }
    };

    a.start();
    b.start();

    a.join();
    b.join();

    return synchronizedCounter.value();
  }
}
