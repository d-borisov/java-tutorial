package kirill.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static kirill.ioStreams.UtilFiles.checkFileAndCreateIfNotExist;

public class FileChanel {

  public static void main(String[] args) throws IOException {
    checkFileAndCreateIfNotExist("xanadu.txt", "");

    RandomAccessFile aFile = new RandomAccessFile("./out/xanadu.txt", "rw");
    FileChannel channel = aFile.getChannel();
    ByteBuffer buf = ByteBuffer.allocate(48);

    int bytesRead = channel.read(buf);

    System.out.println(" this is Buffer - >" + bytesRead);
  }

}
