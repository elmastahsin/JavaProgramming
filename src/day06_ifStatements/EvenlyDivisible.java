package day06_ifStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 30;

        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        //  boolean isDivisibleBy6 = number % 6== 0 ;
        boolean isDivisibleBy6 = isDivisibleBy2 && isDivisibleBy3;

        System.out.println(number + "is divisible by 2 :" + isDivisibleBy2);
        System.out.println(number + "is divisible by 3 :" + isDivisibleBy3);
        System.out.println(number + "is divisible by 5 :" + isDivisibleBy5);
        System.out.println(number + "is divisible by 6 :" + isDivisibleBy6);
    }
}
