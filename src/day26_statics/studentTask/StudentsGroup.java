package day26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup {// StudentsGroup HAS A Student
    public String groupName;
    public int groupID;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupID) {// creates the StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupID = groupID;
        //  students = new ArrayList<>(); // size = 0
    }

    public void addStudent(Student student) {// takes one student object and adds ,t to the arrayList of students
        students.add(student);
    }// Takes one array of students, and adds the array of students to the arraylist of students

    public void addStudent(String name, int age, char gender, String studentID) {

        //      Student student = new Student(name,age,gender,studentID);
        students.add(new Student(name, age, gender, studentID));

    } // takes name, age, gender, id of student info, creates student object by using the given info, then adds the student object to the arraylist of students


    public void removeStudent(String studentID) {
        students.removeIf(p -> p.studentID.equals(studentID));
    }// Takes the id and then removes the student object with the specified id from arraylist of students

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID=" + groupID +
                '}';
    }
}
/*	2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number
	                of students when a group object is passed in the print statement

*/