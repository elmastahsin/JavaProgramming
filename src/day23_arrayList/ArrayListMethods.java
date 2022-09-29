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



    }
}
