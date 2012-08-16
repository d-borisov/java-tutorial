package dima.interfaces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RelatableTest {

  @Test
  public void unacceptable_comparison() throws Exception {
    Human human = new Human(80);
    Computer computer = new Computer(160);

    try {
      compare(human, computer);
    } catch (Exception e) {
      assertThat(e.getMessage(), is("dima.interfaces.Computer cannot be cast to dima.interfaces.Human"));
    }
  }

  @Test
  public void acceptable_comparison__humans() throws Exception {
    Human first = new Human(80);
    Human second = new Human(78);

    assertThat(compare(first, second), is(1));
  }

  @Test
  public void acceptable_comparison__computers() throws Exception {
    Computer first = new Computer(160);
    Computer second = new Computer(170);

    assertThat(compare(first, second), is(-1));
  }
  
  private int compare(Relatable first, Relatable second) {
    return first.isLargerThan(second);
  } 
}
