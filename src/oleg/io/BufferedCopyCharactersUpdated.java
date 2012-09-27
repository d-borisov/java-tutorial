package oleg.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCopyCharactersUpdated {

  public static void main(String[] args) throws IOException {
    try (
        Reader reader = new BufferedReader(new FileReader("xanadu.txt"));
        Writer writer = new BufferedWriter(new FileWriter("characteroutput.txt"));
    ) {
      int c;
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
    }
  }
}
