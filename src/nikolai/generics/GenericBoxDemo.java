package nikolai.generics;

public class GenericBoxDemo {

  public static <U> void addBox(U u, java.util.List<GenericBox<U>> boxes) {
    GenericBox<U> box = new GenericBox<>();
    box.set(u);
    boxes.add(box);
  }

  public static <U> void outputBoxes(java.util.List<GenericBox<U>> boxes) {
    int counter = 0;
    for (GenericBox<U> box : boxes) {
      U boxContents = box.get();
      System.out.println("Box #" + counter + " contains [" +
          boxContents.toString() + "]");
      counter++;
    }
  }

  public static void main(String[] args) {
    java.util.ArrayList<GenericBox<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
    GenericBoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
    GenericBoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
    GenericBoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
    GenericBoxDemo.outputBoxes(listOfIntegerBoxes);
  }
}
