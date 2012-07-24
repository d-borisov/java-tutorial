public class Ramification {

  static {
    String sb = "static init block";
    System.out.println(sb);
  }

  public static void main(String[] args) {
    String str = "e";

    int x = 10;
    int y = 10;
    int z = x + (y / 100);

    if (z == 10) {
      System.out.println("Hello");
    } else {
      System.out.println("niger...");
    }

    switch (str) {
      case "s":
        System.out.println("out => " + str);
      case "e":
        System.out.println("out ==>> " + str);
    }
  }

}
