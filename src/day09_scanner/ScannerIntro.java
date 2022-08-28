package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number :");
        int number = input.nextInt();
        System.out.println("Enter your second number :");
        short num2 = input.nextShort();
        System.out.println("Enter your third number :");
        int num3 = input.nextInt();
        System.out.println("Enter your fourth number :");
        long num4 = input.nextLong();

        input.close();//scanner is closed, cannot read user inputs again
       /* System.out.println("Enter your fourth number :");
        int num5 = input.nextInt();
        scanner is closed at 18, once it's closed cannot read user inputs again
        */
        System.out.println("First entered : " + number);
        System.out.println("Second entered : " + num2);
        System.out.println("Third entered : " + num3);
        System.out.println("Fourth entered : " + num4);


    }
}
/*
import statement: used for importing one java file to another

        regular import: imports one single class from the specified package
            import package.className

        wild import: imports everything from the package
            import package.*;
            */