package day38_exceptionsContinue;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'M' || gender == 'F')) { // If the gender is invalid
            throw new RuntimeException("Invalid gender: " + gender); // throws the run time exceptions, and crash the program
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age == 0) {
            throw new RuntimeException("Age has not been set");// throws the run time exceptions, and crash the program
        }
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {//If the given age is invalid
            throw new RuntimeException("Invalid age:" + age);// throws the run time exceptions, and crash the program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
}
