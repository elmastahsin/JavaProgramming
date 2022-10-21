package day34_abstraction.animalTask;

public class Shark extends Animal implements Wild{

    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void drink() {
        System.out.println("Shark " + getName() + " is drinking Shark beverage");
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Shark " + getName() + " is sleeping 8 hours" );

    }

    @Override
    public void hunt() {

    }
}
