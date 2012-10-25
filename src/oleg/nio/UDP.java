package oleg.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class UDP {

  public static void main(String[] args) throws IOException {
    DatagramChannel channel = DatagramChannel.open();
    channel.socket().bind(new InetSocketAddress(9999));


    String newData = "New String at ... " + System.currentTimeMillis();

    ByteBuffer buf = ByteBuffer.allocate(48);
    buf.clear();
    buf.put(newData.getBytes());
    buf.flip();

    channel.send(buf, new InetSocketAddress("127.0.0.1", 9999));
  }

  public static void receiveUdp() throws IOException {

    DatagramChannel channel = DatagramChannel.open();
    channel.socket().bind(new InetSocketAddress(9999));


    ByteBuffer buf = ByteBuffer.allocate(48);
    buf.clear();
    channel.receive(buf);


    buf.flip();

    byte[] array = new byte[buf.remaining()];
    buf.get(array, 0, array.length);

    System.out.println(new String(array));
  }

}
