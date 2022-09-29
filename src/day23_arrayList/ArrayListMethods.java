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
        numbers.add(10); // 1
        numbers.add(20); // 2
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 5

        numbers.remove(Integer.valueOf(20));

        System.out.println(numbers);

    }
}
