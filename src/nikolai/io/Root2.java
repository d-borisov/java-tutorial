package nikolai.io;

public class Root2 {
  public static void main(String[] args) {
    int i = 9;
    double r = Math.sqrt(9);
    System.out.format("The square root of %d is %f.%n", i, r);

    System.out.format("%f, %1$+020.10f %n", Math.PI);
  }
}
