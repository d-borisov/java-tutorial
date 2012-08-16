package dima.interfaces;

public class Computer implements Relatable {

  private int price;

  Computer(int price) {
    this.price = price;
  }

  @Override
  public int isLargerThan(Relatable other) {
    Computer otherComputer = (Computer) other;
    return Integer.compare(this.price, otherComputer.price);
  }
}
