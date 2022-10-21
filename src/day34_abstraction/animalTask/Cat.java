package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Cat " + getName() + " is eating Cat beverage");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating Cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " is sleeping 8 hours");
    }

    @Override
    public void play() {

    }
}
