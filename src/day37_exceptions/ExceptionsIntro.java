package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {
        System.out.println("Test Started!");
        String str = "Java";
        //  char ch = str.charAt(250); // unchecked exceptions

        //  System.out.println(ch);

        Pizza pizza = null;
        //   pizza.calcCost(); // unchecked exceptions

        //  System.out.println(50 / 0); // unchecked exceptions


        System.out.println("Test completed!");

        System.out.println("--------------------------------");

        int score = 100;
        /* if (score>59){ // Logical error 70 > 59
            System.out.println("Your grade is D");
        } else if (score>70) {
            System.out.println("Your grade is C");
        }*/

        System.out.println("---------------------------------");

        //  FileInputStream file = new FileInputStream(""); // checked exceptions

    //    Thread.sleep(3000); // checked exceptions
    }
}
