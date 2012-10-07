package oleg.path;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class FileChannels {
  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("oleg-test-file");

    try (final FileChannel fc1 = (FileChannel) Files.newByteChannel(path)) {
    }
    try (final FileChannel fc2 = new FileInputStream(path.toFile()).getChannel()) {
    }
    try (final FileChannel fc3 = new RandomAccessFile(path.toFile(), "rw").getChannel()) {
    }
    try (final FileChannel fc4 = FileChannel.open(path)) {
    }

    ByteBuffer output = ByteBuffer.wrap("I was here!\n".getBytes());

    ByteBuffer copy = ByteBuffer.allocate(12);

    try (FileChannel fc = FileChannel.open(path, WRITE, READ)) {
      int bytesRead;
      do {
        bytesRead = fc.read(copy);
      } while (bytesRead != -1 && copy.hasRemaining());//зачем две проверки

      fc.position(0);
      while (output.hasRemaining()) fc.write(output);
      output.rewind();

      long length = fc.size();
      fc.position(length - 1);
      copy.flip();
      while (copy.hasRemaining()) fc.write(copy);
      while (output.hasRemaining()) fc.write(output);
    }

  }

}
