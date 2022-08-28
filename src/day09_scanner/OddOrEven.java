package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("result = " + result);
    }
}
/*
Tasks:
    1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even

   */