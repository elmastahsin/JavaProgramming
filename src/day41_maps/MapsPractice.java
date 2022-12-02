package day41_maps;

import javax.naming.LinkLoopException;
import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {


        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("age",32);
        person1.put("jobTitle","Developer");
        person1.put("salary",3200.54);
        person1.put("married",true);


        System.out.println("person1 = " + person1);





        Map<String, Object> person2 = new LinkedHashMap<>();
        Map<String, Object> person3 = new LinkedHashMap<>();


    }
}
