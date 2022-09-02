package day15_whileLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = input.next();

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char each = str.charAt(i);// each character of the String str

            if (!result.contains("" + each)) {// if the string result does not contain the character of string str yet
                result += each;// then we will add the character to string result
            }
        }
        // if the character is not contained yet in the new string, then we will add it to the new string
        System.out.println(result);




}
}
/*3. Write a program that can remove the duplicated characters from the a string

        Ex:
        str = "aabbbcccc"

        output:
        abc

 */