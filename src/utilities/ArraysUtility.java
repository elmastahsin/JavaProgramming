package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static int[] merge(int[] arr1, int[] arr2) {


        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {


        double[] arr3 = new double[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {


        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {


        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static boolean contains(int[] array, int element) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isContains = true;
            }
        }
        return isContains;
    }
    public static boolean contains(String[] array, String element) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                isContains = true;
            }
        }
        return isContains;
    }
    public static boolean contains(double[] array, double element) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isContains = true;
            }
        }
        return isContains;
    }
    public static boolean contains(char[] array, char element) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isContains = true;
            }
        }
        return isContains;
    }
/*
    public static int [] remove (int[] array, int index){

    }

    public static int [] removeDuplicates(int[] array){

    }
    */
}