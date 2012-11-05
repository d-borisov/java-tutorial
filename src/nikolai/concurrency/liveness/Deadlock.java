package nikolai.concurrency.liveness;

public class Deadlock {
  static class Friend {
    private String name;

    public String getName() {
      return this.name;
    }

    public Friend(String name) {
      this.name = name;
    }

    public synchronized void bow(Friend bower) {
      System.out.format("%s: %s bowed to me!%n", this.name, bower.getName());
      bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower) {
      System.out.format("%s: %s bowed to me back!%n", this.name, bower.getName());
    }
  }

  public static void main(String[] args) {
    final Friend alphonse = new Friend("Alphonse");
    final Friend gastone = new Friend("Gastone");

    new Thread() {
      public void run() {
        alphonse.bow(gastone);
      }
    }.start();

    new Thread(){
      public void run(){
        gastone.bow(alphonse);
      }
    }.start();

  }
}
