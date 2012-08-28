package kirill.generic;

public class Pair<K, V> {

  private K key;
  private V value;

  // Generic constructor
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  // Generic methods
  public void setKey(K key) {
    this.key = key;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public static void main(String[] args) {
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    boolean same = Util.<Integer, String>compare(p1, p2);

    assert true : same;
  }
}
