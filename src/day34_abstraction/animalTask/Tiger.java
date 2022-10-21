package day34_abstraction.animalTask;

public class Tiger extends Animal implements Wild{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Tiger " + getName() + " is drinking water ");

    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName() + " is eating deer ");

    }

    @Override
    public void sleep() {
        System.out.println("Tiger " + getName() + " is sleeping 5 hours ");


    }

    @Override
    public void hunt() {

    }
}
