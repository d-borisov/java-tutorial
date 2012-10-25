package oleg.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeSample {

  public static void main(String[] args) throws IOException {

    final Pipe pipe = Pipe.open();
    Pipe.SinkChannel sinkChannel = pipe.sink();


    String newData = "New String ..." + System.currentTimeMillis();

    ByteBuffer buf = ByteBuffer.allocate(48);
    buf.clear();
    buf.put(newData.getBytes());

    buf.flip();

    while (buf.hasRemaining()) {
      sinkChannel.write(buf);
    }

    Pipe.SourceChannel sourceChannel = pipe.source();
    int bytesRead = sourceChannel.read(buf);
  }

}
