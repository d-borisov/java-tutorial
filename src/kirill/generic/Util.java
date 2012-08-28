package kirill.generic;

public class Util {
    // Generic static method
    public static <K, V> boolean compare(Pair<Integer, String> p1, Pair<Integer, String> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}
