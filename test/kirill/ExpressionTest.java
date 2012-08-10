package kirill;

import junit.framework.Assert;
import org.junit.Test;

public class ExpressionTest extends Assert {

  @Test
  public void test_true(){
    int i = 3 + 4 / 100;
    int e = 3 + (4 / 100);
    assertTrue(i == e);
  }

  @Test
  public void test_false(){
    int i = 5 + 6 / 100;
    int e = (5 + 6) / 100;
    assertFalse(i == e);
  }

}
