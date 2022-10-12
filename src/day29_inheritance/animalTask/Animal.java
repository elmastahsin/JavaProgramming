package day29_inheritance.animalTask;

public class Animal {
    public String name;
    public String breed;
    public char gender;
    public String size;
    public String color;
    public int age;
    public static boolean isAnimal ;
    static {
        isAnimal =true;
    }

    public void setInfo(String name, String breed, char gender, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
/*Custom Classes:
	0. Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()


	1. Dog
			attributes:


			methods:
					 bark()

	2. Cat
			attributes:


			methods:
				meow(), scratch()

	3. Tiger

			attributes:


			methods:
				hunt()

Object Class:  parent of all the classes ( implicitly inherited)
*/