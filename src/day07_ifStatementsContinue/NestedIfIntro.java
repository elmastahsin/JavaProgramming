package day07_ifStatementsContinue;

import javax.swing.*;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 915;
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = " Passed";
            } else {
                result = "Failed";
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("***************************");

        int age = 232;

        if (age >= 1 && age <= 150) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("NOT Eligible");
            }
        } else {
            System.out.println("INVALID AGE");
        }
        System.out.println("***************************");


        int day = 25;
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                result = "Monday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
        } else {
            System.out.println("Invalid Day");
        }

    }
}
