package day13_customMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int num = 12;
        int n1 = 123;
        int n2 = 12124;
        System.out.println(num + " is Odd: " + isOdd(num));
        System.out.println(num + " is Even :" + isEven(num));
        System.out.println(max(n1, n2) + " is max number.");
        System.out.println(min(n1, n2) + " is min number.");

    }

    public static boolean isOdd(int num) {
        //Create a method named isOdd, that can return true if a number is an odd number
        boolean isOdd = false;
        if (num % 2 == 0) {
            isOdd = true;
        }
        return isOdd;
    }

    public static boolean isEven(int num) {
        //Create a method named isEven, that can return true if a number is an even number
      /*  boolean isEven = false ;
        if (num % 2 == 1 ){
            isEven = true;
        }
        return isEven;*/
        return !isOdd(num);
    }

    public static int max(int num1, int num2) {
        //Create a method named max, that can return the maximum number between two numbers
        /*int result = (num1>num2)? num1:num2;
        return result;*/
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int n1, int n2) {
     /*   int result = (n1<n2)? n1 : n2;
        return result;*/
        return (n1 < n2) ? n1 : n2;
    }
}
/*



Create a method named min, that can return the minimum number between two numbers
 */
