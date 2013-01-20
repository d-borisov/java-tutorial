package nikolai.generics;

public class OrderedPair<K, V> implements Pair<K, V> {

  private K key;
  private V value;

  OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public K getKey() {
    return key;
  }

  @Override
  public V getValue() {
    return value;
  }

  @Override
  public void setKey(K key) {
    this.key = key;
  }

  @Override
  public void setValue(V value) {
    this.value = value;
  }

  public static  <K,V> boolean compare(Pair p1, Pair p2) {
    return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());

  }

  public static void main(String[] args) {
    OrderedPair<Integer,Integer> pair1 = new OrderedPair<>(2,4);
    OrderedPair<Integer,Integer> pair2 = new OrderedPair<>(2,4);
    OrderedPair<Integer,Integer> pair3 = new OrderedPair<>(4,2);
    OrderedPair<String,Integer> pair4 = new OrderedPair<>("six", 6);

    System.out.println(compare(pair1,pair2));
  }
}
