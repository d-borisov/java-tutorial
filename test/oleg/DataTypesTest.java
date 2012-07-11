package oleg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataTypesTest {

  @Test
  public void primitives() throws Exception {
    boolean result = true;
    byte b = 1;
    short s = 2;
    int i = 3;

    char capitalC = 'C';

  }

  @Test
  public void fun_with_chars() {
    char a = 2;
    assertEquals(50, '2');
  }

  @Test
  public void integer_literals() {
    int decVal = 26;
    int hexVal = 0x1a;
    int binVal = 0b11010;

    assertEquals(decVal, hexVal);
    assertEquals(decVal, binVal);
  }

  @Test
  public void floating_point() throws Exception {
    double d1 = 123.4;
    double d2 = 1.234e2;
    float f1 = 123.4f;

    assertEquals(d1, d2, 0);
    assertEquals(-1, Double.compare(d1, f1));//преобразование с потерей точности
  }

  @Test
  public void underscores() throws Exception {
    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi = 3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;

//    float pi1 = 3_.1415F;
//    float pi2 = 3._1415F;
//    long socialSecurityNumber1 = 999_99_9999_L;
//    int x3 = 52_;
//    int x5 = 0_x52;
//    int x6 = 0x_52;
//    int x8 = 0x52_;

    int _52 = 200;
    int x1 = _52;

    int x2 = 5_2;
    int x4 = 5___2;
    int x5 = 5_______2;

    int x7 = 0x5_2;
  }

}
