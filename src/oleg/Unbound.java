package oleg;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Unbound {

  public static void printListObjects(List<Object> list) {
    for (Object elem : list) {
      System.out.println(elem + " ");
    }
  }

  public static void printListAnything(List<?> list) {
    for (Object elem : list) {
      System.out.print(elem + " ");
    }
  }

  public static void printListRaw(List list) {
    for (Object elem : list) {
      System.out.print(elem + " ");
    }
  }

  public static void main(String[] args) {

    List<Object> objects = asList(new Object(), new Object());
    List<Integer> ints = asList(1, 2, 3);
    List<String> strings = asList("one", "two", "three");

    printListObjects(objects);
//    printListObjects(ints);
//    printListObjects(strings);

    printListAnything(objects);
    printListAnything(ints);
    printListAnything(strings);

    printListRaw(objects);
    printListRaw(ints);
    printListRaw(strings);

    List<Object> listObj = new ArrayList<>();
    listObj.add(new Object());
    listObj.add(new String());

    List<?> listQ = new ArrayList<>();
    listQ.add(null);
//    listQ.add(new Object()); capture ? cannot be applied
//    listQ.add(new String());

    List<? extends Object> listExt = new ArrayList<>();
    listExt.add(null);
//    listExt.add(new Object());
//    listExt.add(new String());

    listQ = listExt;
    listQ = listObj;

//    listObj = listQ;
//    listObj = listExt;

  }
}
