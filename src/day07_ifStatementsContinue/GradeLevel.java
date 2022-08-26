package day07_ifStatementsContinue;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 18;
        String result = "";
        if (gradeLevel <= 5) { //gradeLevel >= 1 &&
            result = "Elementary School";
        } else if (gradeLevel <= 8) {//gradeLevel >= 6 &&
            result = "Middle school";
        } else if (gradeLevel <= 12) {//gradeLevel >= 9 &&
            result = "High School";
        } else if (gradeLevel <= 16) {//gradeLevel >= 13 &&
            result = "Collage";
        } else {
            result = "Grad School";
        }
        System.out.println("result = " + result);
    }
}
