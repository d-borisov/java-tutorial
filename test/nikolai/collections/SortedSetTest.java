package nikolai.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.is;

public class SortedSetTest extends Assert {

  @Test
  public void sorted_set_and_comparator() {
    List<Something> notUnique = new ArrayList<>();
    notUnique.add(new Something(1, "One"));
    notUnique.add(new Something(2, "Two"));
    notUnique.add(new Something(3, "Three"));
    notUnique.add(new Something(4, "Four"));
    notUnique.add(new Something(5, "One"));
    notUnique.add(new Something(6, "Two"));
    notUnique.add(new Something(7, "One"));
    assertThat(notUnique.size(), is(7));

    SortedSet<Something> unique = new TreeSet<>(new Comparator<Something>() {
      @Override
      public int compare(Something o1, Something o2) {
        return o1.getTitle().compareTo(o2.getTitle());
      }
    });
    unique.addAll(notUnique);
    assertThat(unique.size(), is(4));

    notUnique.removeAll(unique);
    assertThat(notUnique.size(), is(0));
  }

  @Test
  public void sorted_set_and_comparator2() {
    List<Something> notUnique = new ArrayList<>();
    notUnique.add(new Something(1, "One"));
    notUnique.add(new Something(2, "Two"));
    notUnique.add(new Something(3, "Three"));
    notUnique.add(new Something(4, "Four"));
    notUnique.add(new Something(5, "One"));
    notUnique.add(new Something(6, "Two"));
    notUnique.add(new Something(7, "One"));
    assertThat(notUnique.size(), is(7));

    SortedSet<Something> unique = new TreeSet<>(new Comparator<Something>() {
      @Override
      public int compare(Something o1, Something o2) {
        return o1.getTitle().compareTo(o2.getTitle());
      }
    });
    unique.addAll(notUnique);
    assertThat(unique.size(), is(4));

    notUnique.removeAll(new HashSet<Object>(unique));
    assertThat(notUnique.size(), is(3));
  }

  @Test
  public void rangeViewTest() {
    SortedSet<String> set = new TreeSet<>();
    set.add("H");
    set.add("I");
    set.add("J");
    set.add("K");
    set.add("L");
    set.add("M");
    set.add("N");
    assertThat(set.size(), is(7));

    SortedSet<String> subSet = set.subSet("A", "J");
    assertThat(subSet.size(), is(2));//H,I,J

    subSet = set.subSet("A", "J\0");
    assertThat(subSet.size(), is(3));//H,I,J

    subSet = set.subSet("H", "I");
    assertThat(subSet.size(), is(1));//H

    subSet = set.subSet("H\0", "I");
    assertThat(subSet.size(), is(0));

    SortedSet<String> headSet = set.headSet("L");
    assertThat(headSet.size(), is(4));//H,I,J,K

    SortedSet<String> tailSet = set.tailSet("L");
    assertThat(tailSet.size(), is(3));//L,M,N
  }


  private class Something {
    private int ordNumber;
    private String title;

    Something(int ordNumber, String title) {
      this.ordNumber = ordNumber;
      this.title = title;
    }

    public int getOrdNumber() {
      return ordNumber;
    }

    public void setOrdNumber(int ordNumber) {
      this.ordNumber = ordNumber;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    @Override
    public String toString() {
      return "ordNumber=" + ordNumber + "\n" + " title='" + title + "\n";
    }
  }
}
