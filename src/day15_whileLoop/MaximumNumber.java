package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        // write a program that can ask the user enter to enter a number for five times,  print the maximum number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". number :");
            int a = input.nextInt();
            System.out.println(i + 1 + ". number:" + a);
            if (a > max) {
                max = a;
            }

        }
        System.out.println("max = " + max);

        System.out.println("*****************************");
    }
}
