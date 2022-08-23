package day06_ifStatements;

import java.sql.SQLOutput;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        int age = 28;
        if (age >= 21) {

            System.out.println("Eligible");


        }
        if (age < 21) {
            System.out.println("NOT Eligible");

        }

        System.out.println("*******************");

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("NOT Eligible");

        }


    }
}
