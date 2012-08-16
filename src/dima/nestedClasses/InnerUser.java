package dima.nestedClasses;

public class InnerUser {

    public static void main(String[] args) {
        OuterClass a = new OuterClass();
        OuterClass.InnerClass b = a.new InnerClass();

        System.out.println(b.getOuterValue());
        a.setValue(15);
        System.out.println(b.getOuterValue());
    }
}
