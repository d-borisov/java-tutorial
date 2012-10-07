package nikolai.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {
  public static void main(String[] args) {

    if (args.length < 1) {
      System.out.println("usage: FileTest file");
      System.exit(-1);
    }

    Path inputPath = Paths.get(args[0]);

    Path fullPath = inputPath.toAbsolutePath();
    System.out.println(fullPath);
  }
}
