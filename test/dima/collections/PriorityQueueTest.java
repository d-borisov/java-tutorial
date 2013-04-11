package dima.collections;

/*
  Аналог dima.collections.TreeSetTest
 */

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {

  @Test
  public void test_non_comparable_adding() throws Exception {
    final Queue<Object> q = new PriorityQueue<>();
    try {
      q.add(new Object());
    } catch (ClassCastException e) {
      assertThat(e.getMessage(), is("java.lang.Object cannot be cast to java.lang.Comparable"));
    }
  }

}
