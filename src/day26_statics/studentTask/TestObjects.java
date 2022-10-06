package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        System.out.println(group1);
        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        for (Student each : group1.students) {

            System.out.println(each.name + " : " + each.studentID);

        }

        System.out.println("----------------------");

        StudentsGroup group2 = new StudentsGroup("Java & Blues", 1);

        StudentsGroup group3 = new StudentsGroup("Java Black", 1);

        StudentsGroup group4 = new StudentsGroup("Java Red", 1);

        StudentsGroup[] groups = {group1, group2, group3, group4};
        group2.addStudent(student3);
        group2.addStudent(students);
        group3.addStudent(student3);
        group4.addStudent(student4);
        group4.addStudent(student5);
        group3.addStudent(student2);

        group3.addStudent(students);
        group3.removeStudent(student1.studentID);
        group2.removeStudent(student3.studentID);
        group4.removeStudent(student5.studentID);

        for (StudentsGroup eachGroup : groups) {

            System.out.println(eachGroup.groupName + " : " + eachGroup.students);

        }



    }
}
/*3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
*/