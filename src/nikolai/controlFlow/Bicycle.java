package nikolai.controlFlow;

public class Bicycle { //спёр велосипед у Димы, а зачем ему два?!
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void applyBrakes() {
        if (isMoving()) {
            speed--;
        } else {
            System.err.println("Все сломалось, велосипед стоит на месте!");
        }
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    boolean isMoving() {
        return speed > 0;
    }
}
