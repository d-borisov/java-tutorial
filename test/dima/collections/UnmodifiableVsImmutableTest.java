package dima.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UnmodifiableVsImmutableTest {

  @Test
  public void test_changes_making() throws Exception {
    List<String> modifiableList = new ArrayList<>();
    modifiableList.add("a");

    System.out.println("modifiableList:" + modifiableList);
    System.out.println("--");


    //unModifiableList

    assertThat(modifiableList.size(), is(1));

    List<String> unModifiableList = Collections.unmodifiableList(
        modifiableList);

    modifiableList.add("b");

    boolean exceptionThrown = false;
    try {
      unModifiableList.add("b");
      fail("add supported for unModifiableList!!");
    } catch (UnsupportedOperationException e) {
      exceptionThrown = true;
      System.out.println("unModifiableList.add() not supported");
    }
    assertTrue(exceptionThrown);

    System.out.println("modifiableList:" + modifiableList);
    System.out.println("unModifiableList:" + unModifiableList);

    assertThat(modifiableList.size(), is(2));
    assertThat(unModifiableList.size(), is(2));
    System.out.println("--");


    //immutableList


    List<String> immutableList = Collections.unmodifiableList(
        new ArrayList<String>(modifiableList));

    modifiableList.add("c");

    exceptionThrown = false;
    try {
      immutableList.add("c");
      fail("add supported for immutableList!!");
    } catch (UnsupportedOperationException e) {
      exceptionThrown = true;
      System.out.println("immutableList.add() not supported");
    }
    assertTrue(exceptionThrown);


    System.out.println("modifiableList:" + modifiableList);
    System.out.println("unModifiableList:" + unModifiableList);
    System.out.println("immutableList:" + immutableList);
    System.out.println("--");

    assertThat(modifiableList.size(), is(3));
    assertThat(unModifiableList.size(), is(3));
    assertThat(immutableList.size(), is(2));
  }

}
