package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        //a3b4c5

        String result = "";

        for (String s : str.split("")) {
        int frequency  = Collections.frequency(Arrays.asList(str.split("")),s);
        if (!result.contains(s)){
            result+= s + frequency;
        }

        }
        System.out.println(result);







    }
}
