package nikolai.generics;

public class Algorithm {

  public static <T> T max(T x, T y) {
    return x.equals(y) ? x : y;
  }
}