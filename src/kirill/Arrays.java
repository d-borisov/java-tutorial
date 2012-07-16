package src.kirill;

public class Arrays {

  //declaration array first method
  int[] intArray = new int[10];

  //declaration array second method
  String strArray[] = {
      "1", "2", "3", "4", "5",
      "6", "7", "8", "9", "10"
  };

  String strDArray[][] = {
      {"-", "=", "*"},
      {"+", "!=", "/"}
  };

  public void initIntArray() {
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 1;
    }
  }

  public void printIntArray() {
    for (int i = 0; i < intArray.length; i++) {
      System.out.println("int Element " + i + "===>>>" + intArray[i]);
    }
  }

  public void printStrArray() {
    for (int i = 0; i < strArray.length; i++) {
      System.out.println("str Element " + i + "===>>>" + strArray[i]);
    }
  }


  public static void main(String[] args) {
    Arrays arrays = new Arrays();
    arrays.initIntArray();
    arrays.printIntArray();
    arrays.printStrArray();
  }

}
