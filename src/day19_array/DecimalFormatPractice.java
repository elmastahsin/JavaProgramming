package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double n1 = 10.58712435465789213456645342433656645342311424456534654;

        System.out.println(  df.format(n1)  );



    }



}
