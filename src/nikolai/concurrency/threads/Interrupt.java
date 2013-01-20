package nikolai.concurrency.threads;

public class Interrupt {
  public static void doSomething(int in) {
    System.out.println("la-la-la, counting: " + in);
  }

  public static void main(String[] args) throws InterruptedException {

    for (int n = 0; n < 255; n++) {
      doSomething(n);
      if(Thread.interrupted()){
//        return;
        throw new InterruptedException();
      }
    }
  }
}
