package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>(); // random order - accepts null - much faster than others

        Map<String, Integer> map2 = new LinkedHashMap<>(); // Insertion order - accepts null

        Map<String, Integer> map3 = new TreeMap<>(); //sorted order (ascending) - NOT accepts null

        Map<String, Integer> map4 = new Hashtable<>();// random order -Synchronized- not accepts null

    }
}
