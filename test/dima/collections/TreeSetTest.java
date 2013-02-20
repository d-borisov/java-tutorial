package dima.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.is;

/**
 * Тестирование вопроса от Олега
 */
public class TreeSetTest extends Assert {

  @Test
  public void test_non_comparable_adding() throws Exception {
    final Set<Object> s = new TreeSet<>();
    try {
      s.add(new Object());
    } catch (ClassCastException e) {
      assertThat(e.getMessage(), is("java.lang.Object cannot be cast to java.lang.Comparable"));
    }
  }
}
