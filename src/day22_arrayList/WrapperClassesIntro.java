package day22_arrayList;


import day17_customClass.Dog;

public class WrapperClassesIntro {
    public static void main(String[] args) {


        String str = "Java";

        int a1 = 10;

        Integer a2 = 10;

        System.out.println("-------------------------------");

        int b1 = 100;

        Integer b2 = b1; // autoboxing

        // int b3 = b2; // unboxing

        char ch = 'A';
        Character ch2 = ch; // autoboxing

        double d1 = 5.5;
        Double d2 = d1; // autoboxing

        System.out.println("------------------------");

        Integer n1 = 20;

        int n2 = n1; // best UNBOXING
        //   long n3 = n1 ;

        //      double n4 = n1;

        Character e1 = 'Z';

        char e2 = e1;// Choose own primitive UNBOXING
        //    int e3 = e1;
        //  long e4 = e1;

    }

}
