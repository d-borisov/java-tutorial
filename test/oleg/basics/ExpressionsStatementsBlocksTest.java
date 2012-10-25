package oleg.basics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExpressionsStatementsBlocksTest {

  @Test
  public void assignment_in_expression() throws Exception {
    int i = 10;

    //i = n  - is an expression

    int j = i = 5;
    int[] z = {i = 10};
    System.out.println(i = 15);

    assertThat(j, is(5));
    assertThat(z[0], is(10));
    assertThat(i, is(15));
  }

  public void blocks() {
    int i = 10;
    {
      int j = 20;
      i = j + 10;

      {
        int a = 40;
        i = a + 10;
        //int i = 0;
      }
    }

    assertThat(i, is(50));
    //a
  }

}
