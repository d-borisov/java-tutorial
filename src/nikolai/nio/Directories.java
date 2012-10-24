package nikolai.nio;


import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directories {

  public static void main(String[] args) throws IOException {
    Path dir = Paths.get("directory");
    if(!Files.exists(dir)){
      Files.createDirectory(dir);
    }

    Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
    for(Path name: dirs) {
      System.err.println(name);
    }

    String pathString = "level1/level2/level3";
    dir = Paths.get(pathString);
    Files.createDirectories(dir);

    pathString = pathString +"/text.txt";
    Path path = Paths.get(pathString);
    Files.createFile(path);

    dir = Paths.get("level1");


    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
      for (Path file: stream) {
        System.out.println(file.getFileName());
      }
    } catch (IOException | DirectoryIteratorException x) {
      // IOException can never be thrown by the iteration.
      // In this snippet, it can only be thrown by newDirectoryStream.
      System.err.println(x);
    }

  }
}
