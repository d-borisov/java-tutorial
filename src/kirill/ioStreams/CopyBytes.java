package kirill.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static kirill.ioStreams.UtilFiles.checkFileAndCreateIfNotExist;

public class CopyBytes {
  public static void main(String[] args) throws IOException {

    checkFileAndCreateIfNotExist("xanadu.txt", "");

    try (FileInputStream in = new FileInputStream("./out/xanadu.txt");
         FileOutputStream out = new FileOutputStream("./out/outAgain.txt")) {
      int c;

      while ((c = in.read()) != -1) {
        out.write(c);
      }
    }
  }

}