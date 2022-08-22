package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // ---- Implicit casting---------


        byte a = 15;

        short b = (short) a;

        int c = a;

        System.out.println("b = " + b);

        long d = c;

        float e = d;

        //---------Expcilit Casting------

        int x = 100;
        byte y = (byte) x; //explicit casting

        float z = 20.8f;

        short w = (short) z;

        System.out.println("w = " + w);

        double n1 = 2.4;
        byte n2 = (byte) n1;


        System.out.println("n2 = " + n2);

        System.out.println("----------------------");

        int num = 500;
        byte result = (byte) num;

        System.out.println("result = " + result);

        int r = 50000;
        short t = (short) r;

        System.out.println("t = " + t);

        System.out.println("---------------------------");

        double u = 34.5;
        int k = (int) u;

        System.out.println("k = " + k);
        int o = 100;
        double d1 = o;
        System.out.println("d1 = " + d1);


    }


}
