package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritanceContinue.phoneTask.IPhone;
import day30_inheritanceContinue.phoneTask.Nokia;
import day30_inheritanceContinue.phoneTask.Phone;
import day30_inheritanceContinue.phoneTask.Nokia;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Driver;
import day33_abstraction.employeeTask.Employee;

import java.sql.SQLOutput;
import java.util.function.DoubleFunction;

public class ReferanceTypeCasting {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Cat cat = new Dog
        Animal animal = (Animal) new Dog();// implicit casting Upcasting

        System.out.println("---------------");

        Animal animal1 = new Dog();// upcasting

        animal1.setInfo("Max", "husky", 'M', "Large", "White", 4);
        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ((Dog) animal1).bark();// downcasting

        // Dog dog1 = (Dog) animal1; // down casting
        // dog1.bark();
        //((Cat)animal).scratch(); // Dog cannot be converted to Cat because there is no relationship between Dog and Cat

        System.out.println("--------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Black", 350);
        phone.call(911);
        phone.text(123456789);
        ((Nokia) phone).selfDefense();
        //   ((IPhone)phone).faceTime(564758); // Nokia cannot converted to IPhone because there is no relationship

        System.out.println("--------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
        employee.work();
        System.out.println(((Developer)employee).getProgrammingLanguage());

      //  Driver driver = (Driver)employee;




    }
}
