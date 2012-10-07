package nikolai.nio;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RealPath {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("README.md");
    System.out.println("Exists " + Files.exists(path, LinkOption.NOFOLLOW_LINKS));
    System.out.println("isReadable " + Files.isReadable(path));

    try {
      Path fp = path.toRealPath();
      System.out.println(fp.toString());
    } catch (NoSuchFileException x) {
      System.err.format("%s: no such" + " file or directory%n", path);
    } catch (IOException x) {
      System.err.format("%s%n", x);
    }

    for (Path name : path) {
      System.out.println(name);
    }

    if (Files.deleteIfExists(Paths.get("outagain.txt"))) {
      System.out.println("deleted!");
    }

    Path p1 = Paths.get("xanadu.txt");
    Path p2 = Paths.get("outagain.txt");
    Files.copy(p1, p2, LinkOption.NOFOLLOW_LINKS);

    Files.move(p1,p2, StandardCopyOption.REPLACE_EXISTING);
  }
}
