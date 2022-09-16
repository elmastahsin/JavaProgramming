package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers  =new int[5];

        int [] nums = {10,23,34,56,78};

        System.out.println(numbers.length);
        System.out.println(nums.length);


        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("*******************************");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};


        System.out.println("days = " + Arrays.toString(days));

        System.out.println("************************************");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

 /*
        month = new String[12];
        month[0] = "Jan"
        ...
         */

        System.out.println("month = " + Arrays.toString(month) );


        System.out.println("----------------------------------------------------------");

        //  int[] numbers2 = new int[100];

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }





    }
}
