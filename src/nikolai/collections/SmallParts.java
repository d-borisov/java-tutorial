package nikolai.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SmallParts {
    public static void main(String[] args) {
        String[] arr = {"Hello","I","love","you"};
        List<String> edit = Arrays.asList(arr);
//        List<String> elements =

    }


    public static <E> void replace(List<E> list, E val, List<? extends E> newVal) {
        for (ListIterator it = list.listIterator(); it.hasNext(); ) {
            if (val != null && val.equals(it.next())){
                it.remove();
                for(E v: newVal){
                    it.add(v);
                }
            }
        }
    }
}
