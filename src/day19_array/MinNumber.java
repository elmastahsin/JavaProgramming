package day19_array;

public class MinNumber {
    public static void main(String[] args) {

        int [] numbers ={213,55,45,6,-89,-98};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }
        }

        System.out.println("min = " + min);
    }
}
/*

	2. Write a program that can find the minimum number from an array

*/