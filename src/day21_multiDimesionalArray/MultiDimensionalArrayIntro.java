package day21_multiDimesionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};


        System.out.println("-----------------------------");


        int[][] array2D = {{10, 20, 30},
                {40, 50, 60, 70, 80},
                {90, 100},
                {1000, 2000}};
        System.out.println(array2D.length);
        System.out.println(array2D[1].length);

        System.out.println(Arrays.toString(array2D[0]));
        System.out.println(Arrays.toString(array2D[1]));
        System.out.println(Arrays.toString(array2D[2]));
        System.out.println(array2D[2][0]);
        System.out.println(array2D[2][1]);



    }
}
