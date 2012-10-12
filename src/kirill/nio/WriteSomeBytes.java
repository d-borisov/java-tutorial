package kirill.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class WriteSomeBytes {
  static private final byte message[] = {83, 111, 109, 101, 32, 98, 121, 116, 101, 115, 46};

  static public void main(String args[]) throws Exception {

    File file = checkTxtFileAndCreateIfNotExist("writesomebytes", "hello man!");

    try (FileOutputStream fout = new FileOutputStream(file);) {
      FileChannel fc = fout.getChannel();

      ByteBuffer buffer = openingUpByteBuffer();

      fc.write(buffer);
    }
  }

  public static ByteBuffer openingUpByteBuffer() {
    ByteBuffer buffer = ByteBuffer.allocate(1024);

    for (int i = 0; i < message.length; ++i) {
      buffer.put(message[i]);
    }

    buffer.flip();

    return buffer;
  }

}