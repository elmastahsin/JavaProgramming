package day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void drink() {
        System.out.println("Dolphin " + getName() + " is drinking Dolphin beverage");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating Dolphin food");
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin " + getName() + " is sleeping 8 hours" );

    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
