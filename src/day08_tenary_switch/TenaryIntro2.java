package day08_tenary_switch;

public class TenaryIntro2 {
    public static void main(String[] args) {
        int number = 100;
        String result = "";
        /*if(number >0 ){
            result = "Positive";
        } else if (number<0) {
            result = "Negative";
        }else {
            result = "Zero";
        }*/

        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("result = " + result);
        System.out.println("************************************");

        int n = 1;
        String day = "";
        day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : (n == 7) ? "Sunday" : "Invalid input";

        System.out.println(day);
        System.out.println("*************************");

        int num = 10 ;//1~12
        String month = "";
        month = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "Augus" : (num == 9) ? "September"
                : (num==10)?"October":(num==11)?"November":(num==12)? "December":"Invalid input";
        System.out.println("month = " + month);

    }
}
