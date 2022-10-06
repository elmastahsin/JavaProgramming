package day26_statics.studentTask;

public class Student {

    public String name;
    public int age;
    public  char gender ;
    public String studentID;

    public Student(String name, int age, char gender, String studentID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentID='" + studentID + '\'' +
                '}';
    }
    public void study(){
        System.out.println(name + " is studying");
    }
}
/*Warmup tasks:
	1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()


*/