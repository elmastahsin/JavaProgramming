package day07_ifStatementsContinue;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 100000;
        double taxRate = 0;
        boolean isMarried = true;

        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000) {
            taxRate = 0.30;
        }
        if (salary >= 80000 && salary < 100000) {
            taxRate = 0.25;
        }
        if (salary < 80000) {
            taxRate = 0.20;
        }
        if (isMarried) {
            taxRate -= 0.05;
        }
        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;
        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
