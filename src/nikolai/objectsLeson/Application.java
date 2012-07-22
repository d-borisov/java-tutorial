package nikolai.objectsLeson;

public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.printCurrentState();
        radio.turnOn();
        radio.increaseVolume(10);
        radio.setNewBand((float) 101.2);
        radio.printCurrentState();


    }
}
