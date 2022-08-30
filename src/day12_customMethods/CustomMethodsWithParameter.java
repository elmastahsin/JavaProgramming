package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {
        int num = 100;
        oddOrEven(num);

        System.out.println("***************************");

        oddOrEven(10000021);
    }
    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number) {

        if (number % 2 ==0){
            System.out.println(number + " is even number.");
        }else {
            System.out.println(number + " is odd number.");
        }


    }

}
