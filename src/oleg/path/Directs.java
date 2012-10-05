package oleg.path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directs {

  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("..");
    try (final DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
      for (Path file : stream) {
        System.out.println("fn: " + file.getFileName());
      }
    }

    final DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
      public boolean accept(Path file) throws IOException {
        return (Files.isDirectory(path));
      }
    };

    try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, filter)) {
      for (Path entry : stream) {
        System.out.println("sn: " + entry.getFileName());
      }
    }
  }

}