package day01_introToProgramming;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the number of minutes:");

        int minutes= input.nextInt();

        input.close();
        for (int i = minutes; i > 0; i--) {
            for (int j = 59; j >= 0; j--) {
                System.out.println( " \r " + (i-1) + " minutes and " + j + " seconds left");
                Thread.sleep(1000);

            }
        }


        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
}
