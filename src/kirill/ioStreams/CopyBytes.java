package kirill.ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
  public static void main(String[] args) throws IOException {

    FileInputStream in = null;
    FileOutputStream out = null;

    try {

      checkFileAndCreateIfNotExist();

      in = new FileInputStream("xanadu.txt");
      out = new FileOutputStream("outAgain.txt");
      int c;

      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }

  private static void checkFileAndCreateIfNotExist() throws IOException {
    File file = new File("xanadu.txt");

    if (!file.exists()) {
      FileOutputStream outputStream = new FileOutputStream(file);
      byte[] bytesHello = "hello world".getBytes();
      outputStream.write(bytesHello);
    }
  }
}