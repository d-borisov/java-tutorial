package oleg;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ImmutableBicycleTest {

  @Test
  public void init_object() throws Exception {
    ImmutableBicycle bicycle = new ImmutableBicycle();

    assertThat(bicycle.states(), is("cadence:0 speed:0 gear:1"));
  }

}
