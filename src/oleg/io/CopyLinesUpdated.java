package oleg.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLinesUpdated {

  public static void main(String[] args) throws IOException {

    try (
        final BufferedReader input = new BufferedReader(new FileReader("xanadu.txt"));
        final PrintWriter output = new PrintWriter(new FileWriter("characteroutput.txt"))) {

      String line;
      while ((line = input.readLine()) != null) {
        output.println(line);
      }
    }
  }
}
