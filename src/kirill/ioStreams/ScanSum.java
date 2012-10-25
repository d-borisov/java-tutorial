package kirill.ioStreams;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class ScanSum {
  public static void main(String[] args) throws IOException {

    File file = checkTxtFileAndCreateIfNotExist("usnumbers",
        "8.5\n" +
            "32,767\n" +
            "3.14159\n" +
            "1,000,000.1");

    double sum = 0;

    try (Scanner s = new Scanner(new BufferedReader(new FileReader(file)))) {
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