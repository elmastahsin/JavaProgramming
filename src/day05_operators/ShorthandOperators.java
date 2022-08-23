package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;

        System.out.println("a = " + a); // 20
        System.out.println("a = " + a);

        a = 43;

        System.out.println("a = " + a); // 43

        a = 90;

        System.out.println("a = " + a); // 90

        System.out.println("********Addition***********");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        System.out.println("*********Subtraction**********");

        balance -= 1000;
        System.out.println("balance = " + balance);

        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("*********Multiplication***********");

        double salary = 45000;

        System.out.println("salary = " + 2 * salary);
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        salary *= 3;

        System.out.println("salary = " + salary);

        System.out.println("**********************");

        double doge = 0.00000123;

        doge *= 1000;

        System.out.println("doge = " + doge);

        System.out.println("*********Division************");

        double eth = 4;

        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("salary = " + salary);
        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("***********Remainder*********");

        int b = 39;

        System.out.println("b = " + b);
        b %= 7;
        System.out.println("b = " + b);

    }
}
