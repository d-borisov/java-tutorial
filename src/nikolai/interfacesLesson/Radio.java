package nikolai.interfacesLesson;

public interface Radio {
    void increaseVolume(int points);

    void decreaseVolume(int points);

    void setNewBand(float newBand);

    void turnOn();

    void turnOff();

    void changeStateToOpposite();

}
