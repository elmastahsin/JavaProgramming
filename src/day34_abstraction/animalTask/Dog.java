package day34_abstraction.animalTask;

public class Dog extends Animal implements Playable{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Dog " + getName() + " is drinking Dog beverage");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating Dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + getName() + " is sleeping 8 hours" );

    }

    @Override
    public void play() {

    }
}
