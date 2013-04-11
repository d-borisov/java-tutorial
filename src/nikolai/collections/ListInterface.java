package nikolai.collections;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {


        List<Integer> coll = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            coll.add(i);
        }

//        printElements(coll);

//        coll.addAll(new ArrayList<Integer>(coll));
//        printElements(coll);

        int elem = coll.get(5);
        List<Integer> anotherList = new ArrayList<>(coll);
        anotherList.remove(1);
        printElements(anotherList);
        System.out.println(anotherList.get(5).equals(elem));
        System.out.println(anotherList.get(4) == elem);

        List<Integer> shuffle = new ArrayList<>(coll);
        shuffle(shuffle, new Random());
        printElements(shuffle);

        ListIterator<Integer> iter = coll.listIterator();
        Integer x = null;
        if (iter.next() == 0) {
            x = iter.previous();
        }
        System.out.println(x);
        printElements(coll);
        iter.remove();
        iter.next();
        iter.set(999);
        printElements(coll);

    }


    private static <E> void printElements(Collection<E> collection) {
        System.out.println("================");
        for (E e : collection) {
            System.out.println(e);
        }
        System.out.println("=================");
    }

    public static <E> void swap(List<E> list, int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void shuffle(List<?> list, Random r) {
        for (int i = list.size(); i > 1; i--) {
            swap(list, i - 1, r.nextInt(i));
        }
    }
}
