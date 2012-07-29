package oleg;

class Bicycle {

  int cadence = 0;
  int speed = 0;
  int gear = 1;

  Bicycle(int cadence, int gear, int speed) {
    this.cadence = cadence;
    this.gear = gear;
    this.speed = speed;
  }

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

  void printStates() {
    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
  }

}