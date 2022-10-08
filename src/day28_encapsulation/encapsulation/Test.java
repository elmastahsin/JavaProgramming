package day28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student();

        //student1.age = -200;
        // System.out.println(student1.age);


        student1.setAge(10);
        System.out.println(student1.getAge());
        System.out.println("Test Completed");
// student1.setName("Tyson");
        System.out.println(student1.getName());
    }
}
