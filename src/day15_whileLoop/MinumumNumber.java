package day15_whileLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;     // write a program that can ask the user enter to enter a number for five times,  print the minimum number


        int min = 2147483647;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". number :");
            int a = input.nextInt();
            System.out.println(i + 1 + ". number:" + a);
            if (a < min) {
                min = a;
            }

        }
        System.out.println("min = " + min);
    }
}
