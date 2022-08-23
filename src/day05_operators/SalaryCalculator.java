package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = federalTax + stateTax;
        double netIncome = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is :  $" + salaryBeforeTax);
        System.out.println("\tFederal tasx is: $" + federalTax);
        System.out.println("\tState tax is: $" + stateTax);
        System.out.println("\tTotal tax is: $" + totalTax);
        System.out.println("\tNet income is: $" + netIncome);


        System.out.println("*****************************");


        System.out.println("Gross pay is :  $" + salaryBeforeTax +
                "\n\tFederal tasx is: $" + federalTax +
                "\n\tState tax is: $" + stateTax +
                "\n\tTotal tax is: $" + totalTax +
                "\n\tNet income is: $" + netIncome);


    }

}
