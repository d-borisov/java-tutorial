package nikolai;

public class Arrays {

    public static void main(String[] args) {
        int[] firstArr;
        firstArr = new int[10];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = i;
            System.out.println(firstArr[i]);
        }
        System.out.println("===========");
        byte[] byteArray;
        short[] shortArray;
        char[] charArray;
        String[] stringArray;

        short anotherShortArray[]; //а так делать не стоит

        int[] anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        System.out.println(anArray[0]);
        System.out.println(anArray[1]);
        System.out.println(anArray[2]);
        System.out.println(anArray[3]);

        int[] oneMoreArray = {
                10, 11, 12, 14, 15,
                16, 17, 18, 19, 20
        };

        System.out.println("Multi Dimensional Arrays");
        String[][] firstAndSecond = {
                {" Hello ", " World "},
                {" You ", " Are ", " Not ", " Alive "}
        };

        System.out.println(firstAndSecond[0][0]+firstAndSecond[0][1]);
        System.out.println(firstAndSecond[0][0]+firstAndSecond[1][0]);
        System.out.println(firstAndSecond[0][0]+firstAndSecond[1][0]+firstAndSecond[1][1]+firstAndSecond[1][3]);
        System.out.println(firstAndSecond[1][0]+firstAndSecond[1][1]+firstAndSecond[0][1]);

        System.out.println("==============");
        char[] fromArray = {'r','e','f','a','c','t','o','r','i','n','g'};
        char[] toArray = new char[7];
        System.arraycopy(fromArray,2,toArray,0,6);
        toArray[6] = 'y';
        System.out.println(new String(toArray));

    }
}
