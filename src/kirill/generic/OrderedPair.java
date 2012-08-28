package kirill.generic;

public class OrderedPair<K, V> implements PairImpl<K, V> {

  private K key;
  private V value;

  public OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public static void main(String[] args) {
    PairImpl<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
    PairImpl<String, String> p2 = new OrderedPair<String, String>("hello", "world");

    OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
    OrderedPair<String, String>  p4 = new OrderedPair<>("hello", "world");

    System.out.println("key: " +  p1.getKey());
    System.out.println("value: " +  p1.getValue());

    OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());
  }
}