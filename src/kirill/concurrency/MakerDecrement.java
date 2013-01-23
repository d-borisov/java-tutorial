package kirill.concurrency;

class MakerDecrement extends Thread {

  private Counter count;

  MakerDecrement(Counter count) {
    this.count = count;
  }

  @Override
  public void run() {
    count.decrement();
  }

}

