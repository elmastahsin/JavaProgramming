package day07_ifStatementsContinue;

public class WeekDays {
    public static void main(String[] args) {
        int number = 1;
        String result = "";

        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        } else if (number == 3) {
            result = "Wednesday";
        } else if (number == 4) {
            result = "Thursday";
        } else if (number == 5) {
            result = "Friday";
        } else if (number == 6) {
            result = "Saturday";
        } else if (number == 7) {
            result = "Sunday";
        } else {
            result = "Wrong number input";
        }
    }
}
