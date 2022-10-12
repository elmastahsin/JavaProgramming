package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'F', "Small", "White", 4);
        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Felicia", "Stray", 'F', "Small", "Black", 3);
        System.out.println(cat1);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Share Khan", "Bengal", 'M', "Large", "Orange", 5);
        System.out.println(tiger1);

        System.out.println("-------------------------------");


        dog1.eat();
        dog1.sleep();
        dog1.drink();
        dog1.bark();

        System.out.println("-------------------------------");

        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.meow();
        cat1.scratch();

        System.out.println("-------------------------------");

        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        tiger1.hunt();

        System.out.println(dog1.getName());
        System.out.println(cat1.getColor());
        System.out.println(tiger1.getAge());

        dog1.setGender('F');
        tiger1.setAge(6);

        System.out.println(dog1);
        System.out.println(tiger1);

    }
}
