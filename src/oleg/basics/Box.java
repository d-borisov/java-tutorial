package oleg.basics;

public class Box<T> {
  private T t; // T stands for "Type"

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }


  public static void main(String[] args) {
    final Box<Integer> integerBox = new Box<>();
    integerBox.set(3);
    final Integer integer = integerBox.get();

    final Box<Box<Box<String>>> t0 = new Box<>();
    final Box<Box<String>> t1 = new Box<>();
    final Box<String> t2 = new Box<>();
    t2.set("hello");
    t1.set(t2);
    t0.set(t1);
    System.out.println(t0.get().get().get());
  }
}