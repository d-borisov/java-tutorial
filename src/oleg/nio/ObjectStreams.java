package oleg.nio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreams {
  static final String dataFile = "invoicedata";

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      final Object o = new Object();
      out.writeObject(o);
    }

    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
      final Object o;

      o = in.readObject();

      System.out.format("On %s%n", o);
    }

  }
}
