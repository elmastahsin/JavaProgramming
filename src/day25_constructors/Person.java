package day25_constructors;

public class Person {
    public String name;
    public int age ;
    public char gender ;
    public boolean isMarried ;
    public boolean isEmployed ;

    public Person(String name, int age, char gender, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drinking){
        System.out.println(name + " is drinking " + drinking);

    }
    public void sleeping (){
        System.out.println(name + " is sleeping.");
    }
}
