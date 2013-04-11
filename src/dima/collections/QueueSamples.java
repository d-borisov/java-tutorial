package dima.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSamples {

  static <E> List<E> heapSort(Collection<E> c) {
    Queue<E> queue = new PriorityQueue<>(c);
    List<E> result = new ArrayList<>();

    while (!queue.isEmpty())
      result.add(queue.remove());

    return result;
  }

  static <E extends Comparable> List<E> heapSortTyped(Collection<E> c) {
    Queue<E> queue = new PriorityQueue<>(c);
    List<E> result = new ArrayList<>();

    while (!queue.isEmpty())
      result.add(queue.remove());

    return result;
  }

}
