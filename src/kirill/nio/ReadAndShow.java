package kirill.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class ReadAndShow {
  static public void main(String args[]) throws Exception {

    File file = checkTxtFileAndCreateIfNotExist("xanadu", "hello man!");

    try (FileInputStream fin = new FileInputStream(file);) {
      FileChannel fc = fin.getChannel();

      ByteBuffer buffer = ByteBuffer.allocate(11);

      fc.read(buffer);

      buffer.flip();

      int i = 0;
      while (buffer.remaining() > 0) {
        byte b = buffer.get();
        System.out.println("Character " + i + ": " + ((char) b));
        i++;
      }
    }
  }
}