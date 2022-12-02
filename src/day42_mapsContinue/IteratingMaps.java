package day42_mapsContinue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>(); // random order - accepts null - much faster than others &null ket and null values

        map.put("Daniel", 9500);
        map.put("Emily", 10000);
        map.put("Bella", 8500);
        map.put("Arron", 7800);
        map.put("Chris", 32423);
        map.put("breanne", 532523);


        // Iterating the map by the keys

        for (String each : map.keySet()) {
            System.out.println(each);
            //  map.replace(each,map.get(each)*2);

        }
        System.out.println(map);


        System.out.println("---------------------------------------");
        // Iterating the map by the values


        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }


        System.out.println("---------------------------------------");

        // Iterating maps by entry

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }


        System.out.println("---------------------------------------");


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 1000);
          //  System.out.println(eachKey + " : " + eachValue);
        }
        System.out.println(map);

    }


}
