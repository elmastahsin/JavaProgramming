package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        // System.out.println(a > b);
        boolean aIsGreater = a > b;
        System.out.println("aIsGreater = " + aIsGreater);
        System.out.println("*********************");

        int score = 75;

        boolean passed = score >= 60;
        System.out.println("passed = " + passed);

        System.out.println("*******************");
        int age = 21;

        boolean eligableToBuyAlcohol = age >= 21;
        System.out.println("eligableToBuyAlcohol = " + eligableToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println("eligibleToVote = " + eligibleToVote);

        System.out.println("*********************");

        System.out.println(100 > 100);
        System.out.println(100 >= 100);
        System.out.println(100 >= 85);

        System.out.println("******************");

        score = 48;
        boolean failed = score < 60;
        System.out.println("failed = " + failed);

        System.out.println(1000 < 100000);

        System.out.println("*****************");

        System.out.println(95 <= 100);
        System.out.println(100 <= 100);
        // System.out.println("Java" >= "Cydeo");// <, >, <=, >= can only be applicable for numbers

        System.out.println('a' > 'b'); // 65 < 66 so it is false


    }
}
