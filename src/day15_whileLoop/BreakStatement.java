package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {


            if (i == 6) {
                break;
            }
            System.out.print(i);

        }
        System.out.println("********************************");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
            if (i == 'J') {
                System.out.println("Loop is terminated.");
                break;
            }
        }
        for (;;) {
            System.out.println("Hello");
            break;
           // System.out.println("World");
        }


    }
}
