package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));

        ArrayList<Person> studentsList = new ArrayList<>();

        studentsList.addAll(Arrays.asList(people));

        System.out.println(studentsList);

//        studentsList.removeIf(p-> LocalDate.now()-p.dateOfBirthday>55 );


    }
}
