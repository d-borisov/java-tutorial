package nikolai.controlFlow;

public class Application {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 10, 3);
        bicycle.printStates();
        bicycle.applyBrakes();
        bicycle.printStates();
        bicycle.applyBrakes(9);
        bicycle.printStates();
        bicycle.applyBrakes();
    }
}

