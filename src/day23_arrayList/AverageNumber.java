package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(62);
        list.add(70);

        System.out.println(list);
        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }
        double average = (double) sum / list.size();
        System.out.println("average = " + average);
    }
}
/*
	2. Write a program that can find the average number from an arrayList of integers
*/