package oleg;

import java.util.List;

public class UpperBound {

  //static int withWildcard(<? extends Number> num) compilation error

  static <T extends Number> void withParam(T param) {
  }


  static void q_extends_numbers(Iterable<? extends Number> numbers) {
  }

  static <T extends Number> void t_extends_numbers(Iterable<T> numbers) {
  }

  static void strict(Iterable<Number> numbers) {
  }

  public static void main(String[] args) {
    UpperBound.withParam(new Double("22"));

    List<Number> numbers = null;
    List<Double> doubles = null;
    List<? extends Number> uppers = null;

    strict(numbers);
//    checkNum(doubles);
//    checkNum(uppers);

    t_extends_numbers(numbers);
    t_extends_numbers(doubles);
    t_extends_numbers(uppers);

    q_extends_numbers(numbers);
    q_extends_numbers(doubles);
    q_extends_numbers(uppers);
  }
}
