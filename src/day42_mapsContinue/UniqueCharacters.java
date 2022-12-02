package day42_mapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabcccdeeeef";

        Map<Character, Integer> uniques = new HashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency == 1) {
                uniques.put(each.charAt(0), frequency);
            }
        }
        System.out.println(uniques);


    }
}
/*2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}*/