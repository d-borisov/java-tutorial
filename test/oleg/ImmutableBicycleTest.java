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

  @Test
  public void init_object_with_params() throws Exception {
    ImmutableBicycle bicycle = new ImmutableBicycle(1, 2, 3);
    assertThat(bicycle.states(), is("cadence:1 speed:2 gear:3"));
  }

  @Test
  public void should_not_change_original_object() throws Exception {
    ImmutableBicycle bicycle = new ImmutableBicycle();
    bicycle.speedUp(3);
    assertThat(bicycle.states(), is("cadence:0 speed:0 gear:1"));
  }

  @Test
  public void should_return_new_object_with_new_params() throws Exception {
    ImmutableBicycle changed = new ImmutableBicycle().speedUp(3);
    assertThat(changed.states(), is("cadence:0 speed:3 gear:1"));

    ImmutableBicycle changed2 = new ImmutableBicycle().speedUp(6);
    assertThat(changed2.states(), is("cadence:0 speed:6 gear:1"));
  }

  @Test
  public void should_take_into_account_previous_values() throws Exception {
    ImmutableBicycle changed = new ImmutableBicycle(1, 1, 1).speedUp(3);
    assertThat(changed.states(), is("cadence:1 speed:4 gear:1"));
  }

}
