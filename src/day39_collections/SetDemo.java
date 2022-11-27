package day39_collections;

import day16_nestedLoop.FrequcyOfWord;

import javax.sound.sampled.Line;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(); // accepst dublicates keeps insertion order , has index
        list.addAll(Arrays.asList(10, 20, 30, 40, 90));
        list.addAll(Arrays.asList(10, 20, 30, 40, 90));
        list.addAll(Arrays.asList(10, 20, 30, 40, 90));
        list.addAll(Arrays.asList(10, 20, 30, 40, 90));

        System.out.println(list);

        System.out.println("--------------------------------------------------");

        Set<Integer> set1 = new HashSet<>();// Random Order , accepts null key
        set1.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 130, 240, 290));
        set1.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set1.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set1.addAll(Arrays.asList(null, null));


        System.out.println(set1);

        System.out.println("--------------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(); // dont accepts duplicates, Keep insertion order, accepts null


        set2.addAll(Arrays.asList(10, 20, 30, 40, 90)); // Order is like LIFO first entry is head last entry is tail
        set2.addAll(Arrays.asList(10, 200, 130, 240, 290));
        set2.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set2.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set2.addAll(Arrays.asList(null, null));

        System.out.println(set2);

        System.out.println("--------------------------------------------------");
        String str = null;
        //     System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>();// dont accepts duplicates and null Keep sorted(ascending) set
        set3.addAll(Arrays.asList(10, 20, 30, 40, 90)); //
        set3.addAll(Arrays.asList(10, 200, 130, 240, 290));
        set3.addAll(Arrays.asList(10, 20, 30, 40, 90));
        set3.addAll(Arrays.asList(10, 20, 30, 40, 90));
        //   set3.addAll(Arrays.asList(null, null)); //dont accepts null
        System.out.println(set3);

        System.out.println("--------------------------------------------------");


        String[] words = {"Java", "Java", "Java", "Pyhton", "Pyhton", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);

/*
        // System.out.println(result.get(1));

        for (String each : result) {
            System.out.println(each);
        }

*/
        System.out.println(new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]); // converting Set to Array

        System.out.println("Words Array: " + Arrays.toString(words));

        System.out.println("--------------------------------------------------");

        List<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(10,10,10,10,10,10,10,10,10,10,20,22,23,33,33,3,3,3,3,3,3,3,3,3,3,3,3,3,3));

        SortedSet<Integer> n= new TreeSet<>(numbers);//converting List to Set


        System.out.println(n);

    }


}
