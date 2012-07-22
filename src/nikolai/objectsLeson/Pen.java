package nikolai.objectsLeson;

public class Pen {

    String color;

    float inkLevelPercent;

    boolean capClosed = true;

    void setColor(String penColor) {
        color = penColor;
    }

    void write(float minusInk) {
        inkLevelPercent -= minusInk;
    }

    void checkInkLevel() {
        System.out.println("ink level is: " + inkLevelPercent * 100);
    }
}
