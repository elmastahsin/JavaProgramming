package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,};
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        groceriesList.set(2, "Oranges");

        System.out.println(groceriesList);
        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("paper Towels");
        System.out.println(groceriesList);

        System.out.println("---------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        boolean r1 = numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);
        System.out.println(r1);
        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Sumeye"));

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

    }
}
