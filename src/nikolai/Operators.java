package nikolai;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetical operators");
        // result is now 3
        int result = 1 + 2;
        System.out.println(result);

        // result is now 2
        result = result - 1;
        System.out.println(result);

        // result is now 4
        result = result * 2;
        System.out.println(result);

        // result is now 2
        result = result / 2;
        System.out.println(result);

        // result is now 10
        result = result + 8;
        // result is now 3
        result = result % 7;
        System.out.println(result);

        System.out.println("Concatenating Strings");
        String firstPart = "It's time ";
        String secondPart = "to ramble on!";
        String concatenatedString = firstPart + secondPart;
        System.out.println(concatenatedString);

        System.out.println("Unary operators");
        result = 0;

        result += 1;
        System.out.println(result);

        result -= 1;
        System.out.println(result);

        result = +2;
        System.out.println(result);

        result = -2;
        System.out.println(result);

        result++;
        System.out.println("increased by 1: " + result);

        result--;
        System.out.println("decreased by 1: " + result);

        System.out.println("Pre-Post Demo");
        result = 0;
        result++;
        System.out.println("Should  be 1: " + result);

        ++result;
        System.out.println("Should  be 2: " + result);

        System.out.println("Should be 2: " + result++);
        System.out.println("Will be 3: " + result);
        System.out.println("Should be 4: " + ++result);
    }
}

