package day24_dateAndTime;

import java.io.FilterOutputStream;
import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime startingTime = LocalTime.of(10, 30);


        System.out.println(startingTime);

        LocalTime rightNow = LocalTime.now();

        System.out.println(rightNow);

        System.out.println("***************************************");

        LocalTime time1 = LocalTime.of(23, 59, 59);
        System.out.println(time1);

        time1 = time1.plusHours(1);
        System.out.println(time1);

        time1 = time1.plusMinutes(45);
        System.out.println(time1);



    }
}
