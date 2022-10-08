package day28_encapsulation.personTask;

public class Person {
    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public Person(String name, String language) {
        this(name);
        this.language = language;

    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        this(name, age);
        //this(name,gender);
        this.gender = gender;
    }

    public Person(String name, String language, int age, char gender) {
        this(name, age, gender);
        this.language = language;

    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;

    }

    public static void printPlanetName() {
        System.out.println(planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

*/