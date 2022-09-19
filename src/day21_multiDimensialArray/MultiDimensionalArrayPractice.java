package day21_multiDimensialArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;

        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));
            for (int j = 0; j < groups[i].length; j++) {
                System.out.println(groups[i][j]);
            }
        }

        System.out.println("------------------------");

        for (String[] each : groups) {
            System.out.println(Arrays.toString(each));
            for (String i : each) {
                System.out.println(i);
            }
        }

        System.out.println("----------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(groups[i]));
            for (int j = groups[i].length - 1; j >= 0; j--) {
                System.out.println(groups[i][j]);
            }
        }
        System.out.println("*--------------------------------------*");
        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(groups[i]));
            for (String each : groups[i]) {
                System.out.println(each);
            }
        }

        System.out.println("------------------------------");

        System.out.println(Arrays.deepToString(groups));


    }
}
