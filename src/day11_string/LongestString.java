package day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter second string: ");
        String s2 = input.nextLine();
        input.close();
        if (s1.length() > s2.length()) {
            System.out.println(s1);
        } else if (s2.length() > s1.length()) {
            System.out.println(s2);
        } else {
            System.out.println("Equal");
        }

    }
}
/*
* 1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
*/