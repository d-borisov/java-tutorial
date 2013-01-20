package oleg.threads;

public class WaitAndMonitor {

  public static void main(String... args) throws Exception {
    final Object lock = new Object();

    final Runnable templateThread = new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " before sync");
        synchronized (lock) {
          System.out.println(Thread.currentThread().getName() + " after sync");
          try {
            System.out.println(Thread.currentThread().getName() + " before wait");
            lock.wait();//wait освобождает монитор?
            System.out.println(Thread.currentThread().getName() + " after wait");
          } catch (InterruptedException e) {
          }
        }
        System.out.println(Thread.currentThread().getName() + " end of sync");
      }
    };

    for (int i = 0; i < 3; i++) {
      new Thread(templateThread, "" + i).start();
    }

    Thread.sleep(10000L);

    synchronized (lock) {
      lock.notifyAll();
    }

  }
}
