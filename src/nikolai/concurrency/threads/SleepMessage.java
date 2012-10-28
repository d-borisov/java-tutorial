package nikolai.concurrency.threads;

import static java.lang.Thread.*;

public class SleepMessage {
  public static void main(String[] args) {
    String message[] = {
        "Here the list ",
        "of side effects",
        "practice tested",
        "Covering every malice angle",
        "For example you will sleep forever",
        "You will never sleep again"
    };

    for(int i = 0; i < message.length; i++){
      try{
        sleep(4000);
      } catch (InterruptedException e){
        return;
      }
      System.out.println(message[i]);
    }
  }
}
