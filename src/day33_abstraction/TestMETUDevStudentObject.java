package day33_abstraction;

import java.time.LocalDate;

public class TestMETUDevStudentObject {
    public static void main(String[] args) {
        METUDevStudent student1 = new METUDevStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","zero to hero",2);
        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();



    }
}
