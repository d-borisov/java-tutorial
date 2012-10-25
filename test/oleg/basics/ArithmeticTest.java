package oleg.basics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArithmeticTest {

  @Test
  public void testName() throws Exception {
    int result;

    result = 1 + 2;
    assertThat(result, is(3));

    result -= 1;
    assertThat(result, is(2));

    result *= 2;
    assertThat(result, is(4));

    result /= 2;
    assertThat(result, is(2));

    result += 8;
    assertThat(result, is(10));

    result %= 7;
    assertThat(result, is(3));
  }

  @Test
  public void plus_concatenates_strings() throws Exception {
    String firstString = "This is";
    String secondString = " a concatenated string.";

    String thirdString = firstString + secondString;

    assertThat(thirdString, is("This is a concatenated string."));
  }

  @Test
  public void unary() throws Exception {
    int result;

    result = +1;
    assertThat(result, is(1));

    result--;
    assertThat(result, is(0));

    result++;
    assertThat(result, is(1));

    result = -result;
    assertThat(result, is(-1));
  }

  @Test
  public void pre_post_increment_decrement() throws Exception {
    int a = 0;
    a += a++ + ++a;
    assertThat(a, is(2));


    int b = 1;
    b += b++ + ++b;
    assertThat(b, is(5));

    int c = 1;
    c += ++c + c++;
    assertThat(c, is(5));
  }

  @Test
  public void pre_post_increment_decrement_2() throws Exception {
    int a = 0;//1    //2
    assertThat(++a + ++a, is(3));

    int b = 0; //0   //1
    assertThat(b++ + b++, is(1));

    int c = 0; //1   //1
    assertThat(++c + c++, is(2));

    int d = 0; //0   //2
    assertThat(d++ + ++d, is(2));
  }

}
