package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your School Name : ");
        String schoolName = input.nextLine();

        System.out.println("Enter your gender : ");
        String gender = input.next();

        System.out.println("Enter your age :");
        int age = input.nextInt();
        input.nextLine();/* Clear out the scanner
         we have to give extra nextLine() method if we are using a nextLine()
        method after the other methods of scanner*/
        System.out.println("Enter your street name :");
        String street = input.nextLine();

    }
}
