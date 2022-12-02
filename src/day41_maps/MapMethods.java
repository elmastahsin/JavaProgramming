package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");

        map.put("B03", "Nora");
        map.put("A02", "John");

        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");

        map.put("D03", "Alya");


        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Tom");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("C02", "Alice");
        map.replace("A07", "Maria");

        System.out.println(map);


        System.out.println("**************************************************");

        map.remove("A04");

        System.out.println(map);


        System.out.println(map.containsKey("A09"));
        System.out.println(map.containsKey("a03"));
        System.out.println(map.containsValue("tom"));
        System.out.println(map.containsValue("Ali"));


    }
}
