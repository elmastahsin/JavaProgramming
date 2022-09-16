package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] studentName = new String[5];
        /*studentName[0] = "Gulcin";
        studentName[myGroup.length-1] = "Aseel";
        studentName[2] ="Sumeye";
        studentName[1] = "Abidullah";
        studentName[3] = "Khashayar";
*/

        System.out.println("Enter name");

        for (int i = 0; i < studentName.length; i++) {

            studentName[i] = input.next();

        }
   for (int i = 0; i < studentName.length; i++) {
            System.out.println(studentName[i]);
           }

        System.out.println(Arrays.toString(studentName));

        for (int i = 0; i < studentName.length; i++) {
            System.out.println(studentName[i]);
        }
        for (int i = studentName.length - 1; i >= 0; i--) {
            System.out.println(studentName[i]);
        }
        
    }
}
