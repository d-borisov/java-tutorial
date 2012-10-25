package oleg.basics;

import java.util.List;

public class WildcardSubtyping {

  static void extNum(List<? extends Number> list) {
  }

  static void extInt(List<? extends Integer> list) {
  }

  static void lstInt(List<Integer> list) {
  }


  static void supInt(List<? super Integer> list) {
  }

  static void supNum(List<? super Number> list) {
  }

  static void lstNum(List<Number> list) {
  }


  public static void main(String[] args) {
    List<? extends Number> extNum = null;
    List<? extends Integer> extInt = null;
    List<Integer> lstInt = null;
    List<? super Integer> supInt = null;
    List<? super Number> supNum = null;
    List<Number> lstNum = null;


    extNum(extNum);
    extNum(extInt);
    extNum(lstInt);
//    extNum(supInt);
//    extNum(supNum);
    extNum(lstNum);

//    extInt(extNum);
    extInt(extInt);
    extInt(lstInt);
//    extInt(supInt);
//    extInt(supNum);
//    extInt(lstNum);


  }


}
