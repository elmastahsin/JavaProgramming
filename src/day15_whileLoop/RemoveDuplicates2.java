package day15_whileLoop;

import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.next();

        String result = "";

        for (int i = 0; i < (str.length() - 1); i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch == ch2) {
                continue;
            }
            result += "" + ch;


        }

        System.out.println("String : " + str);
        System.out.println("result = " + result);


    }
}
/*3. Write a program that can remove the duplicated characters from the a string

        Ex:
        str = "aabbbcccc"

        output:
        abc

 */