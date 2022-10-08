package day27_accessModifiers;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Eketerina", 23, 'F');
        StudentClass student2 = new StudentClass("Alena", 26, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(StudentClass.schoolName);
        System.out.println(StudentClass.schoolName);

        System.out.println(StudentClass.secretCode);
        System.out.println(StudentClass.secretCode);
    }
}
