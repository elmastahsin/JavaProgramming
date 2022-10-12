package day29_inheritance.encapsulation;

public class StudentTestObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Mike",23,'M', 'A', "METU");
        Student student2 = new Student("Lina",33,'F', 'A', "Yale University");


        System.out.println(student1);
        student1.setSchoolName("MIT");
        student1.setGrade('B');
        System.out.println(student1);
        System.out.println(student2);
    }
}
