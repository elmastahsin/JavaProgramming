package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mike");
        Person person2 = new Person("Tom", 'M');
        Person person3 = new Person("Harry", 23);
        Person person4 = new Person("Lina", "English");
        Person person5 = new Person("ALina", 23, 'F');
        Person person6 = new Person("Sam", 43, 'M', "English");

        person4.name = "James";
        // person1.planet ="Mars";
        Person.planet = "Mars";


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Baklava");
        person2.drink("Cola");
        person3.drink("Tea");
        person4.drink("Coffee");
    }
}
