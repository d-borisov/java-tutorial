package kirill.ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static kirill.ioStreams.UtilFiles.checkTxtFileAndCreateIfNotExist;

public class CopyBytes {
  public static void main(String[] args) throws IOException {

    File inFile = checkTxtFileAndCreateIfNotExist("xanadu", "hello world, man!");
    File outFile = checkTxtFileAndCreateIfNotExist("xanadu", "");

    try (FileInputStream in = new FileInputStream(inFile);
         FileOutputStream out = new FileOutputStream(outFile)) {
      int c;

      while ((c = in.read()) != -1) {
        out.write(c);
      }
    }
  }

}