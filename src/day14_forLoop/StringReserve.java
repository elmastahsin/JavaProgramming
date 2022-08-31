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
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
