package kirill.annotations;

public class Exe {

    @Using
    public static void out(){
        System.out.println("method run...");
    }

    public static void main(String[] args) {
        Exe.out();
    }

}
