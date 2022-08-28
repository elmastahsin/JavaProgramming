package day10_String;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";
        System.out.println();

        input.close();

        System.out.println(" ****************************** ");

        String s1 = "Cat";
        String s2 = "Dog";
        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s2);


        System.out.println("**********************************");


        String str1 = new String("Java");// Creates two objects: 1. String pool, 2. in heap (outside string)
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        String t1 = "Pyhton";
        String t2 = new String("Pyhton");
        String t3 = new String("Pyhton");

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);

        System.out.println(t1 == t2);
        System.out.println(t2 == t3);


    }
}
