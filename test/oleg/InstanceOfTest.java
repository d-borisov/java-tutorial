package oleg;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InstanceOfTest {

  interface A1 {
  }

  interface A2 {
  }

  interface B1 extends A1 {
  }

  class C {
  }

  class D extends C implements B1 {
  }

  class E extends D implements A2 {
  }


  @Test
  public void test_instance_of() throws Exception {

    Object e = new E();

    assertTrue(e instanceof E);
    assertTrue(e instanceof A2);
    assertTrue(e instanceof D);
    assertTrue(e instanceof C);
    assertTrue(e instanceof B1);
    assertTrue(e instanceof A1);
  }

  @Test
  public void another_way() throws Exception {

    Object e = new E();

    assertTrue(E.class.isInstance(e));
    assertTrue(A1.class.isInstance(e));
    assertTrue(D.class.isInstance(e));

    assertFalse(int.class.isInstance(e));
    assertFalse(E.class.isInstance(null));
  }

}
