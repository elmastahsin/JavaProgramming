package day07_ifStatementsContinue;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 35000;
        int creditScore = 780;
        String result = "";

        if (salary >= 45000 && creditScore >= 700) {
            result = "You are Eligibile for loan";
        } else {
            result = "You are NOT Eligible for loan";
        }
        System.out.println(result);
    }
}
