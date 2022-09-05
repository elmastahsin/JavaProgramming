package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = input.next();
        System.out.println("Enter a char :");
        String ch = input.next();
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch.charAt(0)) {
                charCount++;
            }

        }
        System.out.println(str);
        System.out.println(ch);
        System.out.println(charCount);

    }
}
/* 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:5
		     	*/