package kirill.concurrency;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CountTest extends Assert {

  @Test
  public void thread(){
    Counter count = new Counter();

    assertThat(count.value(), is(0));

    (new MakerIncrement(count)).start();
    (new MakerDecrement(count)).start();

    assertThat(count.value(), is(0));


  }
}
