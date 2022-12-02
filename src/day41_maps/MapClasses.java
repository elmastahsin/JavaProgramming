package day41_maps;

import java.sql.ClientInfoStatus;
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order - accepts null - much faster than others &null ket and null values

        hashMap.put("Daniel", 9500);
        // hashMap.put("Daniel",9500);

        hashMap.put("Emily", 10000);
        hashMap.put("Bella", 8500);
        hashMap.put("Arron", 7800);
        hashMap.put("Chris", null);
        hashMap.put("breanne", null);
        hashMap.put(null, 1223);
        hashMap.put(null, 19000);
        hashMap.put(null, 10000);

        System.out.println("hashMap = " + hashMap);
        System.out.println("----------------------------------------------------------------------------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // Insertion order - accepts null &null key and null values

        linkedHashMap.put("Daniel", 9500);
        linkedHashMap.put("Emily", 10000);
        linkedHashMap.put("Bella", 8500);
        linkedHashMap.put("Arron", 7800);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("breanne", null);
        linkedHashMap.put(null, 1223);
        linkedHashMap.put(null, 19000);
        linkedHashMap.put(null, 10000);

        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("----------------------------------------------------------------------------");
        Map<String, Integer> treeMap = new TreeMap<>(); //sorted order (ascending) - NOT accepts null key but accepts null values
        treeMap.put("Daniel", 9500);
        treeMap.put("Emily", 10000);
        treeMap.put("Bella", 8500);
        treeMap.put("Arron", 7800);
        treeMap.put("Chris", null);
        treeMap.put("breanne", null);// value can be null
        // treeMap.put(null, 1223); key cannot be null
        // treeMap.put(null, 19000);
        //treeMap.put(null, 10000);

        System.out.println("treeMap = " + treeMap);
        System.out.println("----------------------------------------------------------------------------");
        Map<String, Integer> hashTable = new Hashtable<>();// random order -Synchronized- not accepts null key & values
        hashTable.put("Daniel", 9500);
        hashTable.put("Emily", 10000);
        hashTable.put("Bella", 8500);
        hashTable.put("Arron", 7800);
      //  hashTable.put("Chris", null);
      //  hashTable.put("breanne", null);// value can not be null
        // hashTable.put(null, 1223); key cannot be null
        // hashTable.put(null, 19000);
        //hashTable.put(null, 10000);

        System.out.println("hashTable = " + hashTable);
        System.out.println("----------------------------------------------------------------------------");
    }
}
/* pair name & salary
 * Daniel =95000
 * Emily = 10000
 * Bella = 8500
 *
 *
 *
 *
 *
 *
 * */