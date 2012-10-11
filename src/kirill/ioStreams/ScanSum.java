package kirill.ioStreams;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

import static kirill.ioStreams.UtilFiles.checkFileAndCreateIfNotExist;

public class ScanSum {
  public static void main(String[] args) throws IOException {

    checkFileAndCreateIfNotExist("usnumbers.txt",
        "8.5\n" +
        "32,767\n" +
        "3.14159\n" +
        "1,000,000.1");

    double sum = 0;

    try (Scanner s = new Scanner(new BufferedReader(new FileReader("./out/usnumbers.txt")))) {
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