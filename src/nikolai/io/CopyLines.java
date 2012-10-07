package nikolai.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyLines {
  public static void main(String[] args) throws IOException {
    try (
        BufferedReader reader = new BufferedReader(new FileReader("xanadu.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("outagain.txt"));
    ) {
      String line;
      while((line = reader.readLine()) != null){
        writer.write(line+" \n");

      }
    }
  }
}
