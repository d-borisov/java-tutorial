package oleg.basics;

import org.junit.Test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PathTest {

  @Test
  public void paths_are_equal() {
    Path p1 = Paths.get("README.md");
    Path p4 = FileSystems.getDefault().getPath("README.md");

    assertThat(p1, is(p4));
  }

  @Test
  public void test() throws Exception {
    Path path = Paths.get("README.md");

    System.out.format("toString: %s%n", path.toString());
    System.out.format("getFileName: %s%n", path.getFileName());
    System.out.format("getName(0): %s%n", path.getName(0));
    System.out.format("getNameCount: %d%n", path.getNameCount());
    System.out.format("subpath(0,2): %s%n", path.subpath(0, 1));
    System.out.format("getParent: %s%n", path.getParent());
    System.out.format("getRoot: %s%n", path.getRoot());

    System.out.format("toRealPath %s%n", path.toRealPath());
    System.out.format("toUri %s%n", path.toUri());
    System.out.format("toAbsolutePath %s%n", path.toAbsolutePath());
  }
}
