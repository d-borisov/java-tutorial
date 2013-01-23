package kirill.concurrency;

class MakerIncrement extends Thread {

  private Counter count;

  MakerIncrement(Counter count) {
    this.count = count;
  }

  @Override
  public void run() {
    count.increment();
  }
}
