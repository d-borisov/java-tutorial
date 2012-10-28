package nikolai;

import nikolai.concurrency.syncronization.SynchronizedMethods;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SynchronizedMethodsTest extends Assert {

  @Test
  public void synchronizedMethodsTest() throws InterruptedException {

    SynchronizedMethods methods = new SynchronizedMethods();
    for (int i = 0; i < 10; i++) {
      assertThat(SynchronizedMethods.threads(), is(0));
    }
  }
}
