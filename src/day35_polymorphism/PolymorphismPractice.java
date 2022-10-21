package day35_polymorphism;

import day34_abstraction.animalTask.Animal;
import day34_abstraction.animalTask.Tiger;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Animal tiger1 = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        //   tiger1.hunt(); hunt() method can not exist in animal class
    }
}
