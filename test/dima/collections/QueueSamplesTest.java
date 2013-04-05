package dima.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class QueueSamplesTest {

  @Test
  public void cant_use_non_comparable() throws Exception {
    List<Object> list = new ArrayList<>();
    list.add(new Object());
    list.add(new Object());

    try {
      QueueSamples.heapSort(list);
      fail();
    } catch (ClassCastException e) {
      assertThat(e.getMessage(), is("java.lang.Object cannot be cast to java.lang.Comparable"));
    }
  }

  @Test
  public void can_use_comparable() throws Exception {
    List<Object> list = new ArrayList<>();
    list.add("a");
    list.add("x");
    list.add("b");

    List<Object> sorted = QueueSamples.heapSort(list);

    assertThat((String) sorted.get(0), is("a"));
    assertThat((String) sorted.get(1), is("b"));
    assertThat((String) sorted.get(2), is("x"));
  }

  @Test
  public void dont_compile_typed_for_non_comparable() throws Exception {
    //List<Object> list = new ArrayList<>();
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("x");
    list.add("b");

    List<String> sorted = QueueSamples.heapSortTyped(list);
  }

}
