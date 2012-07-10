package oleg;

public class ImmutableBicycle {
  private int cadence = 0;
  private int speed = 0;
  private int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed += increment;
  }

  void applyBrakes(int decrement) {
    speed -= decrement;
  }

  String states() {
    return "cadence:" + cadence + " speed:" + speed + " gear:" + gear;
  }

}
