package nikolai;

import nikolai.concurrency.SynchronizedMethods;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SynchronizedMethodsTest extends Assert {

  @Test
  public void synchronizedMethodsTest(){
      assertThat(SynchronizedMethods.threads(),is(0));
  }
}
