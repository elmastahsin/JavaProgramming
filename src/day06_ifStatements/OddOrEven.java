package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 20;

        boolean isEven = number % 2 == 0;

        boolean isOdd = number % 2 != 0; // boolean = isOdd != isEven


        System.out.println(number + " is even number: " + isEven);
        System.out.println(number + " is odd number: " + isOdd);

        System.out.println("****************************");

        if (isEven){
            System.out.println("Even Number");
        }
        if(isOdd){
            System.out.println("Odd Number");
        }

    }
}
