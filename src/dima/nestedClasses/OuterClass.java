package dima.nestedClasses;

public class OuterClass {

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    class InnerClass {

        public int getOuterValue() {
            return value;
        }
    }
}
