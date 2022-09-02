package day15_whileLoop;

import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = "xyzzzaaaaxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt((i+1))){
                continue;
            }
            result += "" + str.charAt(i);


        }

        System.out.println("String : " +str);
        System.out.println("result = " + result);



    }
}
/*3. Write a program that can remove the duplicated characters from the a string

        Ex:
        str = "aabbbcccc"

        output:
        abc

 */