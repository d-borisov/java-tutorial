package nikolai.interfacesLesson;


public class BBKRadio implements Radio{

    int volume;
    float band;
    boolean on;

    public void increaseVolume(int points) {
        volume += points;
    }

    public void decreaseVolume(int points) {
        volume -= points;
    }

    public void setNewBand(float newBand) {
        band = newBand;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void changeStateToOpposite() {
        on = !on;
    }

    @Override
    public String toString() {
        return "BBKRadio \n" +
                "volume=" + volume + "\n"+
                "band=" + band + "\n" +
                "on=" + on;
    }
}
