package day21_multiDimensialArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, {1000, 2000}};

        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println(array2D[i][j]);
            }
        }
        System.out.println("--------------------------------");


        for (int[] each : array2D) {
            System.out.println(Arrays.toString(each));
            for (int i : each) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------");

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.println(array2D[i][j]);
            }
        }
        for (int[] each : array2D) {
            for (int eachArray : each) {
                System.out.println(eachArray);
            }
        }
    }
}
