package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable,Flyable,Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void drink() {
        System.out.println("Duck " + getName() + " is drinking Duck beverage");
    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName() + " is eating worm");
    }

    @Override
    public void sleep() {
        System.out.println("Duck " + getName() + " is sleeping 8 hours" );

    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
