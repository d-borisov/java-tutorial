package oleg.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.lang.System.out;
import static java.nio.file.FileVisitResult.CONTINUE;

public class Walk {
  public static void main(String[] args) throws IOException {
    Files.walkFileTree(Paths.get("."), new PrintFiles());

  }


  public static class PrintFiles extends SimpleFileVisitor<Path> {

    // Print information about each type of file.
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
      if (attr.isSymbolicLink()) {
        out.format("Symbolic link: %s ", file);
      } else if (attr.isRegularFile()) {
        out.format("Regular file: %s ", file);
      } else {
        out.format("Other: %s ", file);
      }
      out.println("(" + attr.size() + " bytes)");
      return CONTINUE;
    }

    // Print each directory visited.
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
      out.format("Directory: %s%n", dir);
      return CONTINUE;
    }

    // If there is some error accessing the file, let the user know.
    // If you don't override this method and an error occurs, an IOException is thrown.
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
      System.err.println(exc);
      return CONTINUE;
    }
  }

}
