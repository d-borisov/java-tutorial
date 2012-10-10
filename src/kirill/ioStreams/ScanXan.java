package kirill.ioStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static kirill.ioStreams.UtilFiles.checkFileAndCreateIfNotExist;

public class ScanXan {
  public static void main(String[] args) throws IOException {

    checkFileAndCreateIfNotExist("xanadu.txt", "");

    try (Scanner s = new Scanner(new BufferedReader(new FileReader("./out/xanadu.txt")));) {
      while (s.hasNext()) {
        System.out.println(s.next());
      }
    }
  }
}

