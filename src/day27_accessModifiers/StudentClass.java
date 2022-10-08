package day27_accessModifiers;

public class StudentClass {

    public String name;
    public int age;
    public char gender;
    public static String schoolName;
    public static String secretCode;

    public StudentClass(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    static {
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }

    @Override
    public String     toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
