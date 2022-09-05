package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username : ");
        String userName = input.next();
        System.out.println("Enter your password: ");
        String password = input.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
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
                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }
            }
            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked. Please try later.");
            }
        }
    }
    public static void cydeoLogin (String userName , String password){

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in.");
        }else {
            System.out.println("Invalid credentials.");
        }
    }
}