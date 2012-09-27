package oleg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesUpdated {
  public static void main(String[] args) throws IOException {

    try (
        final FileOutputStream out = new FileOutputStream("outagain.txt");
        final FileInputStream in = new FileInputStream("xanadu.txt")
    ) {
      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    }
  }
}
