package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Tyson",23,'M',"Java Developer",95000, LocalDate.of(2022,12,12));


        Employee e2 = new Employee("Mike",32,'M',"Java Developer",105000, LocalDate.of(2020,2,2));

        System.out.println(e1);
        System.out.println(e2);



    }
}
