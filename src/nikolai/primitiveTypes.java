package nikolai;

public class primitiveTypes {
    public static void main(String[] args) {
        int gear = 1;
        System.out.println(gear);

        //int literals
        int decVal = 127;
        int hexVal = 0x7F;
        int binVal = 0b1111111;
        System.out.println(decVal);
        System.out.println(hexVal);
        System.out.println(binVal);
        //make it short??

        System.out.println("==============");
        short decValShort = 127;
        short hexValShort = 0x7F;
        short binValShort = 0b1111111;
        System.out.println(decValShort);
        System.out.println(hexValShort);
        System.out.println(binValShort);

        System.out.println("=============");
        double d1 = 123.4;
        System.out.printf("d1 is %f \n",d1);

        double d2 = 1.234e2;
        System.out.printf("d2 is %f \n",d2);

        float f1  = 123.4f;
        System.out.printf("f1 is %f \n",f1);//WTF???

        //String literals
        System.out.println("I want to print some quotes \"\"\"quotes\"\"\" from the new \n line. And couple of backslashes too \\ \\ \\ \\ ");

        //using underscore
        long creditCardNumber = 1234_5678_9012_3456L;

        System.out.println("Like a normal number: " + creditCardNumber);
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        int fiftyTwo = 5____________________2;
//        int floatNumber = 54F; won't work
        int x1 = 5_2;

    }
}
