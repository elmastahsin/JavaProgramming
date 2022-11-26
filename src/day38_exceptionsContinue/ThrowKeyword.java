package day38_exceptionsContinue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();


        if (age < 0 || age > 150) {
            //      System.err.println("Invalid Age");
            //    System.exit(1);
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative");
            } else {
                throw new InputMismatchException("Age of person cannot be greater than 150");
            }
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("----------------------------------------");

        //     throw new RuntimeException("Runtime exception");
        //       System.out.println("Hello World"); // After throw kwy board remaining codes can not be executed


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
