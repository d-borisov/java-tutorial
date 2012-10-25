package kirill.ioStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilFiles {

  public static File checkTxtFileAndCreateIfNotExist(String fileName, String content) {

    File file = null;

    try {
      file = File.createTempFile(fileName, ".txt");
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (!file.exists()) {
      try (FileOutputStream outputStream = new FileOutputStream(file);) {
        byte[] bytesHello = content.getBytes();
        outputStream.write(bytesHello);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return file;
  }
}
