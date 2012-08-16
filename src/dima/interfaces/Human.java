package dima.interfaces;

public class Human implements Relatable {

  private int weight;

  Human(int weight) {
    this.weight = weight;
  }

  @Override
  public int isLargerThan(Relatable other) {
    Human otherHuman = (Human) other;
    return Integer.compare(this.weight, otherHuman.weight);
  }
}
