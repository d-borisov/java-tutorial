package nikolai.objectsLeson;

import static java.lang.String.format;

public class Radio {
    int volume;
    float band;
    boolean on;

    public Radio() {
        this.volume = 0;
        this.band = 0;
        this.on = false;
    }

    void increaseVolume(int points) {
        volume += points;
    }

    void decreaseVolume(int points) {
        volume -= points;
    }

    void setNewBand(float newBand) {
        band = newBand;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void changeStateToOpposite() {
        on = !on;
    }

    String stateToPrint() {
        if (on) {
            return "turned on";
        } else {
            return "turned off";
        }
    }

    void printCurrentState() {
        System.out.println(format("nikolai.objectsLeson.Radio is currently %s", stateToPrint()) +
                format(";%n current volume is: %s", volume) +
                format(";%n current band is: %s", band));
    }
}
