package oleg;

class MountainBike extends Bicycle {
  int seatHeight;

  MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  void setHeight(int newValue) {
    seatHeight = newValue;
  }

}