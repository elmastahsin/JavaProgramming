package day24_dateAndTime;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1999, 2, 28);

        System.out.println(birthday);

        System.out.println(today.getYear());

        System.out.println(birthday.getDayOfMonth());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("-----------------------");
        today = today.plusYears(1);

        System.out.println(today);

        System.out.println("----------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("----------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3).minusDays(121);

        System.out.println(yourBirthday);

        System.out.println(yourBrotherBirthday);

        System.out.println("--------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);

        LocalDate birthday2 = LocalDate.of(1994,7,7);

        boolean r1 = birthday1.equals(birthday2);

        System.out.println(r1);


        System.out.println("-----------------------------");


        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("-------------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());



    }
}
