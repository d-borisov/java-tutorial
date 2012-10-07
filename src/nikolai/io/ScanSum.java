package nikolai.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {
  public static void main(String[] args) throws IOException {

    double sum = 0;
    try (
        Scanner s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
    ) {
      s.useLocale(Locale.US);

      while (s.hasNext()) {
        if (s.hasNextDouble()) {
          sum += s.nextDouble();
        } else {
          s.next();
        }
      }
    }
    System.out.println(sum);
  }
}