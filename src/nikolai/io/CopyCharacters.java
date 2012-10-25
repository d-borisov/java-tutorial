package nikolai.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
  public static void main(String[] args) throws IOException {

    try (
        FileReader input = new FileReader("xanadu.txt");
        FileWriter output = new FileWriter("outagain.txt");
    ) {
      int c;

      while ((c = input.read()) != -1) {
        output.write(c);
      }
    }
  }
}
