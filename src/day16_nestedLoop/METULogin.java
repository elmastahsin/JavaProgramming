package day16_nestedLoop;

import java.util.Scanner;

public class METULogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username : ");
        String userName = input.next();
        System.out.println("Enter your password: ");
        String password = input.next();

        if (userName.equals("METU") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in.");
        } else {
            for (int i = 1; i <= 3; i++) {

                if(i != 2) {
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }

                System.err.println("Invalid entry please try again.");
                System.out.println("Enter your username : ");
                userName = input.next();
                System.out.println("Enter your password: ");
                password = input.next();
                if (userName.equals("METU") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }
            }
            if (!(userName.equals("METU") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked. Please try later.");
            }
        }
    }
    public static void METULogin (String userName , String password){

        if (userName.equals("METU") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in.");
        }else {
            System.out.println("Invalid credentials.");
        }
    }
}
/*
* 1. Create a class named METULogIn. you are writing a code for the log-in function of the METU Application, assume that your credentials are:
                    username: METU
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

*/