package day41_maps;

import day17_customClass.Employee;
import jdk.jshell.Snippet;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(12, 234, 456, 678, 4567));


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(12, 234, 456, 678, 4567));


        List<List<Integer>> list = new ArrayList<>();

        //  list.addAll(Arrays.asList(list1, list2));
        list.add(list1);
        list.add(list2);

        System.out.println(list);

//10
        System.out.println(list.get(1));
        System.out.println(list.get(1).get(2));


        System.out.println("-----------------------------------");


        List<Set<Integer>> listOfSet = new ArrayList<>();
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());

        System.out.println(listOfSet);
        // {10,5,20}

        listOfSet.get(0).addAll(Arrays.asList(10, 5, 20));
        listOfSet.get(1).addAll(Arrays.asList(30, 29, 32));
        listOfSet.get(2).addAll(Arrays.asList(12, 43, 556));
        listOfSet.get(3).addAll(Arrays.asList(2, 3, 5));
        System.out.println(listOfSet);


        System.out.println("------------------------------");

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {12, 23, 35, 44, 75, 86};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);
        //System.out.println(listOfArrays);

        listOfArrays.get(0)[2] = 34;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        List<List<Employee>> teams = new ArrayList<>();

        // List<int[][]> listOfMultiArrays = new ArrayList<>();


    }
}
