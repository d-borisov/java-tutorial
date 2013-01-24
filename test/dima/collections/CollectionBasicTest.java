package dima.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class CollectionBasicTest extends Assert {

  @Test
  public void toArray_pass_correct_length() throws Exception {
    final Collection<String> c = new ArrayList<>();
    c.add("foo");
    c.add("bar");

    final String[] correctLenght = new String[c.size()];
    final String[] arr = c.toArray(correctLenght);
    assertThat(arr, is(correctLenght));
    assertThat(arr.length, is(2));
    assertThat(arr[0], is("foo"));
  }

  @Test
  public void toArray_creates_new_array_if_necessary() throws Exception {
    final Collection<String> c = new ArrayList<>();
    c.add("foo");
    c.add("bar");

    final String[] smallerArray = new String[0];
    final String[] arr = c.toArray(smallerArray);
    assertThat(arr, not(smallerArray));
    assertThat(arr.length, is(2));
    assertThat(arr[0], is("foo"));
  }
}
