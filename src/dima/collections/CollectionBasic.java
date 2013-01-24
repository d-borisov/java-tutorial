package dima.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionBasic {

  public static void main(String[] args) {
    final Collection<String> c = new ArrayList<>();
    c.add("foo");
    c.add("bar");
    final String[] arr = c.toArray(new String[0]);
    System.out.println(arr[0]);
  }
}
