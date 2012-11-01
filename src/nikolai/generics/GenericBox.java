package nikolai.generics;

import java.io.Serializable;
import java.util.ArrayList;

public class GenericBox<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return this.t;
  }

  public <U extends Number> void inspect(U u){
    System.out.println("T: " + t.getClass().getName());
    System.out.println("U: " + u.getClass().getName());
  }

  public static void boxTest(GenericBox<Number> box){
    //
  }

  public static void main(String[] args) {
    GenericBox<Integer> box = new GenericBox<>();
    box.set(56);

    Integer i = box.get();
//    box.inspect("this is the number,isn't it?");
    box.inspect(2);

//    boxTest(new GenericBox<Integer>());
    boxTest(new GenericBox<Number>());

  }

}
