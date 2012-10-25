package oleg.basics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayTest {

  @Test
  public void array_declaration() throws Exception {

    int bad[];

    int[] good;
  }

  @Test
  public void multi_dim_declaration() throws Exception {
    int[] a[][];
    int[][] b[][];

    int[] ugly[] = {{1, 2}, {3, 4}};

    assertThat(ugly[0][0], is(1));
    assertThat(ugly[1][1], is(4));

  }

  @Test
  public void three_ways_to_create_array() throws Exception {

    int[] first = new int[2];
    first[0] = 0;
    first[1] = 1;

    int[] second = new int[]{0, 1};

    int[] third = {0, 1};

    assertThat(first, equalTo(second));
    assertThat(second, equalTo(third));
  }


  @Test
  public void length() throws Exception {

    int[] arr = {0, 1, 2};

    assertThat(arr.length, is(3));


    int[] empty = {};
    assertThat(empty.length, is(0));
  }

  @Test
  public void multi_dimension_arrays() throws Exception {
    String[][] names = {
        {"Mr. ", "Mrs. ", "Ms. "},
        {"Smith", "Jones"}
    };

    String mr = names[0][0] + names[1][0];
    String ms = names[0][2] + names[1][1];

    assertThat(mr, is("Mr. Smith"));
    assertThat(ms, is("Ms. Jones"));
  }

  @Test
  public void comma_at_the_end() throws Exception {
    int[] arr = {0,};

    assertThat(arr.length, is(1));
  }

  @Test
  public void copy_array() throws Exception {

    char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
    char[] copyTo = new char[7];

    System.arraycopy(copyFrom, 2, copyTo, 0, 7);

    assertThat(new String(copyTo), is("caffein"));
  }

}
