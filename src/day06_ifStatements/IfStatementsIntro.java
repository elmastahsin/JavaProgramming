package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number > 0;

        if (isPositive) {
            System.out.println(number + " is positive number.");

        }

        boolean isNegative = number < 0;
        if (isNegative) {
            System.out.println(number + " is negative number.");

        }
        boolean isZero = number == 0;
        if (isZero) {
            System.out.println(number + " is zero.");

        }
    }
}
