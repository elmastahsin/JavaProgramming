package day07_ifStatementsContinue;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 100;
        String result = "";


        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);

    }
}
