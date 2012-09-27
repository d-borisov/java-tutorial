package oleg.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersUpdated {

  public static void main(String[] args) throws IOException {
    try (
        FileReader reader = new FileReader("xanadu.txt");
        FileWriter writer = new FileWriter("characteroutput.txt")
    ) {
      int c;
      while ((c = reader.read()) != -1) {//TODO charBuffer?
        writer.write(c);
      }
    }
  }
}
