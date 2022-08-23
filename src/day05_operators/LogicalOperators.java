package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 60000;
        int age = 42;

        int creditScore = 650;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("*******************");

        age = 32;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println("eligibleToVote = " + eligibleToVote);


        System.out.println("********************");

        country = "Australia";
        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "UK" || country == "Australia ";
        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        System.out.println("*********************");

        String answer = "no";

        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println("validAnswer = " + validAnswer);

        System.out.println("**************************");

        char grade = 'A';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println(!true);
        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("*****************");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("*****************");

        System.out.println(true == !false && false == !true && true != !true);


    }
}
