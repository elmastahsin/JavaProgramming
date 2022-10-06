package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        StudentsGroup group1 = new StudentsGroup("Java Turtles",1);
        System.out.println(group1);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);








    }
}
/*3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
*/