package nikolai.concurrency;

public class ThreadInterference {

  public static void main(String[] args) throws InterruptedException {
    final Counter counter = new Counter();


    Thread a = new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          counter.increment();
        }
        System.out.println(this.getName() + " value: " + counter.value());
      }
    };

    Thread b = new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          counter.decrement();
        }
        System.out.println(this.getName() + " value: " + counter.value());
      }
    };


    a.start();
    b.start();

    System.out.println("value: " + counter.value());
  }

}
