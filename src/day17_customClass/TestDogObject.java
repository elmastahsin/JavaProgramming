package day17_customClass;

public class TestDogObject {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        dog1.eat();
        System.out.println(dog1.name);
        System.out.println(dog1);
Dog dog2 = new Dog();
dog2.setInfo("Bella", "Huskey", 'F',2,"small", "brown" );
    }
}
