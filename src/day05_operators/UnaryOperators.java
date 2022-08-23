package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = 10 ;
//pre increment/decrement
        System.out.println("x = " + ++x);
        System.out.println("x = " + x);

        int y = 100 ;
        System.out.println("y = " + --y);

        System.out.println("y = " + y);

// post increment/decrement

        int a = 50 ;
        System.out.println("a = " + a++); // 50
        System.out.println("a = " + a); // 51

        int b = 25 ;
        System.out.println("b = " + --b); // 60
        System.out.println("b = " + b); // 59

        System.out.println("***********************");

        int n = 30 ;

        int m = n++ ; // m = 30 n = 31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; // q = 60 , z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);



    }
}
