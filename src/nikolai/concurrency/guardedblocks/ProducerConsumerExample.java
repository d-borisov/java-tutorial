package nikolai.concurrency.guardedblocks;

public class ProducerConsumerExample {
  public static void main(String[] args) {
    Drop drop = new Drop();
    (new Thread(new Consumer(drop))).start();
    (new Thread(new Producer(drop))).start();
  }
}
