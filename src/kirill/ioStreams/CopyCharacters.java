package kirill.ioStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class CopyCharacters {
  public static void main(String[] args) throws IOException {

    File sourceFile = checkTxtFileAndCreateIfNotExist("xanadu", "hello man!");
    File received = checkTxtFileAndCreateIfNotExist("characteroutput", "");

    try (FileReader inputStream = new FileReader(sourceFile);
         FileWriter outputStream = new FileWriter(received)) {
      int c;
      while ((c = inputStream.read()) != -1) {
        outputStream.write(c);
      }
    }
  }
}