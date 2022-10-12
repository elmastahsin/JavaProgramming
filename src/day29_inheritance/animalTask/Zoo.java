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
    }
}
