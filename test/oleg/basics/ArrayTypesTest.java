package oleg.basics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayTypesTest {

  @Test
  public void autoboxing() throws Exception {

    int[] ints = {1, 2, 3};
    Object[] objects = {1, 2, 3};

    assertThat(objects[0].getClass().getName(), is("java.lang.Integer"));
  }

  @Test
  public void covariant_arrays_vs_invariant_lists() throws Exception {

    // I
    Object obj1 = new Object();
    Integer int1 = 2;

    obj1 = int1;//OK!
    //int1 = obj1;  //error: incompatible types,    required: Integer,    found:    Object

    //II

    Object[] obj2 = {1, 2, 3};
    Integer[] int2 = {1, 2, 3};

    obj2 = int2; //OK!
    //int2 = obj2; //error: incompatible types,    required: Integer[],    found:    Object[]


    //III

    List<Object> obj3 = new ArrayList<>();
    List<Integer> int3 = new ArrayList<>();

    //obj3 = int3; //error: incompatible types, required: List<Object>,   found:    List<Integer>
    //int3 = obj3; //error: incompatible types, required: List<Integer>,  found:    List<Object>
  }


  @Test(expected = ArrayStoreException.class)
  public void arrays_are_reifiable() throws Exception {
    Object[] objects = new Integer[1];
    objects[0] = "Ok";
  }

  @Test
  public void error_generic_array_creation() throws Exception {
    //I
//    List<Integer>[] a = new ArrayList<Integer>[0];//error: generic array creation

    //II
    class II<T> {
      public void method() {
        T[] t;
//        t = new T[0]; error: generic array creation
      }
    }
  }
}


//Effective Java. Item 25.