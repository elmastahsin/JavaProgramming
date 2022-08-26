package day08_tenary_switch;

public class TernariesIntro {
    public static void main(String[] args) {
        int score = 85;
        String result = "";

        result = (score > 50) ? "Passed" : "Failed";
        System.out.println("result = " + result);


        System.out.println("**********************");

        int age = 34;
        String r = "";
        if (age >= 21) {
            r = "Eligible";
        } else {
            r = "NOT eligible";
        }
        r = (age >= 21) ? "Eligible" : "NOT eligible";

        System.out.println("r = " + r);
    }

}
        /* if (score>50){
            result = "Passed";
            }else{
            result= "Failed";
            }
 */



