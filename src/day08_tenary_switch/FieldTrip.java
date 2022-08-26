package day08_tenary_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 100;
        boolean validGrade = grade >= 1 && grade <= 6;
        String location = "Unknown";
        String teacherInCharge = "Unknown";
        int numOfGroups = 0;
        if (validGrade) {
            if (grade == 1) {
                location = "Apple Orchad";
                numOfGroups = 3;
                teacherInCharge = " Ms.Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacherInCharge = " Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacherInCharge = " Mr.Wilson";
            } else if (grade == 4) {
                location = "Movie Theatre";
                numOfGroups = 2;
                teacherInCharge = " Mr.Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroups = 5;
                teacherInCharge = " Mr. Lela";
            } else {
                location = "Six Flags";
                numOfGroups = 8;
                teacherInCharge = " Mr.Watt";
            }
        }
        System.out.println("Location - " + location);
        System.out.println("Number of Groups - " + numOfGroups);
        System.out.println("Teacher in charge - " + teacherInCharge);
    }
}
