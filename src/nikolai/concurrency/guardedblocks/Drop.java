package nikolai.concurrency.guardedblocks;

public class Drop {
  private String message;
  private boolean empty = true;

  public synchronized String take() {
    while (empty) {
      try {
        wait();
      } catch (InterruptedException ignored) {
      }
    }
    empty = true;
    notifyAll();
    return message;
  }

  public synchronized void put(String message) {
    while (!empty) {
      try {
        wait();
      } catch (InterruptedException ignored) {
      }
    }
    empty = false;
    this.message = message;
    notifyAll();
  }
}
