package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable{
    @Override
    public void fly() {

    }

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Eagle " + getName() + " is drinking water ");

    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snake ");

    }

    @Override
    public void sleep() {
        System.out.println("Eagle " + getName() + " is sleeping 5 hours ");


    }
}
