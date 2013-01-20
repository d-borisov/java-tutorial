package nikolai.generics;

public class Box {
  private Object object;

  public void set(Object object){
    this.object = object;
  }

  public Object get(){
    return this.object;
  }

  public static void main(String[] args) {
    Box box = new Box();
    box.set(54);

    Integer i = (Integer) box.get();
  }

}
