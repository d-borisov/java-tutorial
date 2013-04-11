package nikolai.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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
