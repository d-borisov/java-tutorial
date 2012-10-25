package nikolai.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;

public class ObjectStreams {
  static final String dataFile = "invoicedata";

  static final BigDecimal[] prices = {
      new BigDecimal("19.99"),
      new BigDecimal("9.99"),
      new BigDecimal("15.99"),
      new BigDecimal("3.99"),
      new BigDecimal("4.99")};
  static final int[] units = {12, 8, 13, 29, 50};
  static final String[] descs = {"Java T-shirt",
      "Java Mug",
      "Duke Juggling Dolls",
      "Java Pin",
      "Java Key Chain"};

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    try (
        ObjectOutputStream out = new ObjectOutputStream(new
            BufferedOutputStream(new FileOutputStream(dataFile)));
    ) {
      out.writeObject(Calendar.getInstance());
      for (int i = 0; i < prices.length; i++) {
        out.writeObject(prices[i]);
        out.writeInt(units[i]);
        out.writeUTF(descs[i]);
      }
    }

    try (ObjectInputStream in = new ObjectInputStream(new
        BufferedInputStream(new FileInputStream(dataFile)));
    ) {
      Calendar date = null;
      BigDecimal price;
      int unit;
      String desc;
      BigDecimal total = new BigDecimal(0);

      date = (Calendar) in.readObject();

      System.out.format("On %tA, %<tB %<te, %<tY:%n", date);

      try {
        while (true) {
          price = (BigDecimal) in.readObject();
          unit = in.readInt();
          desc = in.readUTF();
          System.out.format("You ordered %d units of %s at $%.2f%n",
              unit, desc, price);
          total = total.add(price.multiply(new BigDecimal(unit)));
        }
      } catch (EOFException e) {
      }
      System.out.format("For a TOTAL of: $%.2f%n", total);
    }
  }
}