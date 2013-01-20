package oleg.basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Max {

  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(1, 2, 4, 4, 3);
    final Integer max = max(ls);
    System.out.println(max);
  }


  public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
    Iterator<? extends T> i = coll.iterator();
    T candidate = i.next();

    while (i.hasNext()) {
      T next = i.next();
      if (next.compareTo(candidate) > 0)
        candidate = next;
    }
    return candidate;
  }

}
