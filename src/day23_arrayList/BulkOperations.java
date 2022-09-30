package day23_arrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);

        System.out.println("list1 = " + list1);

        System.out.println("----------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,65,85,97,54));

        System.out.println("scores = " + scores);

        System.out.println("----------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Taylor","Karim", "Max", "Maria"));

        System.out.println("students = " + students);

        students.addAll(2,Arrays.asList("Harry","Mike","Susan"));

        System.out.println("students = " + students);


        System.out.println("--------------------------");

        Integer [] nums = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        // l1.addAll(Arrays.asList(nums));

        System.out.println("l1 = " + l1);

        System.out.println("--------------------------");

        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll(Arrays.asList("Alina", "Tom", "Sam","Tylor"));

        boolean hasAlina = employeesList.contains("Alina");

        System.out.println("hasAlina = " + hasAlina);

        boolean hasAlinaTom = employeesList.containsAll(Arrays.asList("Alina", "Tom"));

        System.out.println("hasAlinaTom = " + hasAlinaTom);

        boolean hasMikeSamTylor = employeesList.containsAll(Arrays.asList("Sam", "Tylor","Mike"));
        System.out.println("hasMikeSamTylor = " + hasMikeSamTylor);

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );

        list.removeAll(Arrays.asList(10,20));

        System.out.println("list = " + list);

        System.out.println("-----------------------------------");

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alina", "Tom", "Sam","Tylor","Susan","Jenifer","Rob"));

        System.out.println("developers = " + developers);

          developers.retainAll(Arrays.asList("Alina", "Tylor","Susan"));

        System.out.println("developers = " + developers);

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));
        System.out.println("groceriesList = " + groceriesList);
     //   groceriesList.retainAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato"));
        groceriesList.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        System.out.println("groceriesList = " + groceriesList);










    }
}
