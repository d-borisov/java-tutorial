package oleg.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

  public static void checkRealPath() {
    final Path path = Paths.get("README.md");
    try {
      final Path fp = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
    } catch (NoSuchFileException e) {
      System.err.format("%s: no such" + " file or directory%n", path);
    } catch (IOException e) {
      System.err.format("%s%n", e);
    }
  }

  public static void files_is() {
    final Path path = Paths.get("README.md");
    System.out.println(
        Files.isExecutable(path) &&
            Files.isRegularFile(path) &&
            Files.isReadable(path) &&
            Files.isSymbolicLink(path)
    );
  }

}
