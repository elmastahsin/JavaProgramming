package day25_constructors;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df =DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time = LocalTime.of(17,5);

        System.out.println(time.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf ));


        System.out.println("-----------------------------");
        DateTimeFormatter dtfe = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        LocalDateTime myDateTime = LocalDateTime.of(2020,11,24,13,00);
        System.out.println(myDateTime.format(dtfe));

        //1. use the LocalDateTime get the date and time in the following format:
      //  Tuesday, 1:00 pm, Nov/24/2020
    }
}
