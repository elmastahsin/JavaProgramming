package day42_mapsContinue;

import java.util.LinkedHashMap;
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


        Map<String, String> employees = new LinkedHashMap<>();
        employees.putAll(map);
        System.out.println(map);
        System.out.println(employees);
        System.out.println(employees==map);
        System.out.println(employees.equals(map));

    }
}
