package day34_abstraction.animalTask;

public class Parrot extends  Animal implements Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Parrot" + getName() + " is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eating seeds");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot " + getName() + " is sleeping 8 hours ");

    }

    @Override
    public void play() {

    }
}
