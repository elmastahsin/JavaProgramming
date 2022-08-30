package day12_customMethods;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class CustomMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        eligiblToBuyAlcohol(age);

        System.out.println("Enter number :");
        int number = input.nextInt();
        oddOrEvenOrZero(number);

        System.out.println("Enter first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        maxNumber(num1, num2);

        System.out.println("Enter your score:");
        char score = input.next().toUpperCase().charAt(0);
        gradeOfStudent(score);

        System.out.println("Enter your firt name:");
        String firstName = input.next();
        System.out.println("Enter your last name :");
        String lastName = input.next();
        initial(firstName,lastName);
    }

    // create a method that can check if a person is eligible to buy alcohol  (age)
    public static void eligiblToBuyAlcohol(int age) {
        if (age >= 21 && age <= 150) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not Eligible to buy alcohol");
        }
    }

    // create a method that can check if a number is odd, or even or zero (number)
    public static void oddOrEvenOrZero(int number) {
        if (number == 0) {
            System.out.println(number + " is zero.");
        } else {
            if (number % 2 == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");
            }

        }
    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNumber(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the max number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the max number.");
        } else {
            System.out.println("Equal");
        }

    }

    // create a method that can calculate the grade of the students  (score)
    public static void gradeOfStudent(char grade) {
        String result = "";
        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println(result);
    }

    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initial(String firstName, String lastName){
        String initial = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        System.out.println("initial = " + initial);
    }
        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */
}


