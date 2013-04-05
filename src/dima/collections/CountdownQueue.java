package dima.collections;

import java.util.LinkedList;
import java.util.Queue;

public class CountdownQueue {

  public static void main(String[] args) throws InterruptedException {
    int time = args.length > 0 ? Integer.parseInt(args[0]) : 10;
    Queue<Integer> queue = new LinkedList<>();

    for (int i = time; i >= 0; i--)
      queue.add(i);

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
      Thread.sleep(1000);
    }
  }
}
