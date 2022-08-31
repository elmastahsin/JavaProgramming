package day14_forLoop;

import java.util.Scanner;

public class StringReserve {
    public static void main(String[] args) {
        String str = "Java";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println("str = " + str);
        System.out.println("reverse = " + reverse);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String word = input.nextLine();
        System.out.println(reverse(word));
    }

    public static String reverse(String str) {
        String reverse = "";// to contain all the characters of the given string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) {// i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);// to get each character of the string starting from last index to index zero
        }
        return reverse;
    }
}
