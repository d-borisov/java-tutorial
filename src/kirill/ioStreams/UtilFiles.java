package kirill.ioStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilFiles {

  public static void checkFileAndCreateIfNotExist(String fileName, String content) {
    File file = new File("./out/" + fileName);

    if("".equals(content)){
      content = "hello world, man!";
    }

    if (!file.exists()) {
      try (FileOutputStream outputStream = new FileOutputStream(file);) {
        byte[] bytesHello = content.getBytes();
        outputStream.write(bytesHello);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
