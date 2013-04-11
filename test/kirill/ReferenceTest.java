package kirill;

import org.junit.Assert;
import org.junit.Test;

import java.lang.ref.SoftReference;

public class ReferenceTest extends Assert {

  @Test
  public void soft_referer() throws InterruptedException {
    StringBuilder builder = new StringBuilder();
    SoftReference<StringBuilder> softBuilder = new SoftReference(builder);


    assertTrue(builder != null);
    assertTrue(softBuilder.get() != null);

    builder = null;

    assertTrue(builder == null);
    assertTrue(softBuilder.get() != null);

  }

}
