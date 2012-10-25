package kirill.ioStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class ScanXan {
  public static void main(String[] args) throws IOException {

    File file = checkTxtFileAndCreateIfNotExist("xanadu", "hello man!");

    try (Scanner s = new Scanner(new BufferedReader(new FileReader(file)));) {
      while (s.hasNext()) {
        System.out.println(s.next());
      }
    }
  }
}

