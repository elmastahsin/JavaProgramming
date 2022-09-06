package day16_nestedLoop;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer="";
        do {
            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter math operator :");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid entry please Enter math operator :");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            System.out.println("Would you like to continue calculate ? Yes/No");
            answer = input.next().toLowerCase();
        } while (answer.equals("yes"));
        System.out.println("Have a nice day...");
    }
}
