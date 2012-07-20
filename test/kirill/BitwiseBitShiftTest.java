import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BitwiseBitShiftTest extends Assert {

  @Test
  public void test() {
    int bitmask = 0x000F;
    int val = 0x2222;
    assertThat((val & bitmask), is(2));
  }

  @Test
  public void inst(){

    Parent p = new Parent();
    Child ch = new Child();

    assertTrue(p instanceof Parent);
    assertTrue(ch instanceof Parent);
    assertTrue(ch instanceof Child);

  }

}

class Parent {}
class Child extends Parent{}
