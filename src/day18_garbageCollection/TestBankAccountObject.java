package day18_garbageCollection;

public class TestBankAccountObject {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
obj1.setInfo("Mike",1234565432);
        System.out.println(obj1);
        obj1.deposit(1000);
        obj1.checkBalance();
        obj1.withdraw(700);
        obj1.checkBalance();
    }
}
