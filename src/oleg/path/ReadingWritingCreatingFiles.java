package oleg.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
import static java.nio.charset.Charset.defaultCharset;
import static java.util.Arrays.asList;

public class ReadingWritingCreatingFiles {
  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("oleg-test-file");

    forSmallFiles(path);
    textFiles(path);
    streams(path);
    byteBuffers(path);
  }

  /*
  * methods used to iterate over a stream or lines of text
  * */
  private static void textFiles(Path path) throws IOException {
    out.println("===>> text files <<===");

    try (final BufferedReader reader = Files.newBufferedReader(path, defaultCharset())) {
      String s;
      while ((s = reader.readLine()) != null) {
        out.println(s);
      }
    }

    try (final BufferedWriter writer = Files.newBufferedWriter(path, defaultCharset())) {
      writer.write("hello"); //wtf, where is chaining?
      writer.newLine();
      writer.write("world");
      writer.newLine();
    }
  }

  /*
  * for small files, simple, common cases
  * */
  private static void forSmallFiles(Path path) throws IOException {
    out.println("===>> small files <<===");

    final byte[] array = Files.readAllBytes(path);
    out
        .printf("array length %d%n", array.length)
        .printf("array %s%n", Arrays.toString(array));


    final List<String> strings = Files.readAllLines(path, defaultCharset());
    out
        .printf("lines size %d%n", strings.size())
        .printf("lines %s%n", strings);

    Files.write(path, asList("hello", "world"), defaultCharset());

    Files.write(path, "whats up\nnothing".getBytes(defaultCharset()));
  }


  private static void streams(Path path) throws IOException {
    out.println("===>> streams <<===");
    try (final InputStream inputStream = Files.newInputStream(path)) {
    }
    try (final OutputStream outputStream = Files.newOutputStream(path)) {
    }
  }


  public static void byteBuffers(Path path) throws IOException {
    try (final SeekableByteChannel sbc = Files.newByteChannel(path)) {
      final ByteBuffer buf = ByteBuffer.allocate(10);
      while (sbc.read(buf) > 0) {
        buf.rewind();
        System.out.print(defaultCharset().decode(buf));
        buf.flip();
      }
    }
  }
}
