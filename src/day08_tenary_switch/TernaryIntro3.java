package day08_tenary_switch;

import day06_ifStatements.IfAndElsePractice;

public class TernaryIntro3 {
    public static void main(String[] args) {
        int score = 130;
        String result = "INVALID SCORE";

        result = (score >= 0 && score <= 100)?
                (score>=60)? "PASSED":"FAILED"
                : "INVALID SCORE" ;

     /*   if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = "PASSED";
            } else {
                result = "FAILED";
            }
        } else {
            result = "INVALID SCORE";
        }*/
        System.out.println(result);
    }
}
