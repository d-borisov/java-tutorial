package oleg;

public class ImmutableBicycle {
  private final int cadence;
  private final int speed;
  private final int gear;

  public ImmutableBicycle() {
    this(0, 0, 1);
  }

  public ImmutableBicycle(int cadence, int speed, int gear) {
    this.cadence = cadence;
    this.speed = speed;
    this.gear = gear;
  }

  void changeCadence(int newValue) {
  }

  void changeGear(int newValue) {
  }

  ImmutableBicycle speedUp(int increment) {
    return new ImmutableBicycle(this.cadence, this.speed + increment, this.gear);
  }

  void applyBrakes(int decrement) {
  }

  String states() {
    return "cadence:" + cadence + " speed:" + speed + " gear:" + gear;
  }

}
