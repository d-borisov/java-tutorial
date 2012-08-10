package kirill;

public class Operators {

  public static void main(String[] args) {
    String concatenation = concatenation();
    print(concatenation);

    int sumArithmetic = arithmetic();
    print(String.valueOf(sumArithmetic));

    int lastUnaryResult = unaryAndPrePost();
    print(String.valueOf(lastUnaryResult));

  }

  public static String concatenation() {
    String onePart = "This";
    String twoPart = "is";
    String threePart = "SPARTA";

    return onePart + " " + twoPart + " " + threePart;
  }

  public static int arithmetic() {
    int five = 10 - 5;
    int num_74 = five + 56 - 13;
    int num_51 = num_74 + 13 - 5 * 2;
    int num_125 = num_51 + 80 - 16 * 2 / 5;
    int num_182 = num_125 + 59 - 38 * 4 / 9 % 7;

    return five + num_74 + num_51 + num_125 + num_182;
  }

  public static int unaryAndPrePost() {
    int result = +1;
    result = result --;
    result = result++;
    result = ++result;

    return result;
  }

  private static void print(String in) {
    System.out.println("===>>> " + in);
  }

}
