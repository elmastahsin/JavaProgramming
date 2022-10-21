package day34_abstraction.animalTask;

public class Lion extends Animal implements Wild{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void drink() {
        System.out.println("Lion " + getName() + " is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating buffalo");
    }

    @Override
    public void sleep() {
        System.out.println("Lion " + getName() + " is sleeping 8 hours" );

    }

    @Override
    public void hunt() {

    }
}
