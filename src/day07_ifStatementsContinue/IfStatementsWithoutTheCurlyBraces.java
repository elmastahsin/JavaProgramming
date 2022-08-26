package day07_ifStatementsContinue;

public class IfStatementsWithoutTheCurlyBraces {
    public static void main(String[] args) {
        int age= 23;
        if (age>=21)
            System.out.println("Eligible");
        else
            System.out.println("NOT eligible");
        System.out.println("**********************");



// IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE


        int day =2;
        if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day ==4)
            System.out.println("Wednesday");
        else if (day == 4 )
            System.out.println("Thursday");
        else if (day ==5 )
            System.out.println("Friday");
        else if (day == 6)
                System.out.println("Saturday");
        else System.out.println("Monday");

    }
}
