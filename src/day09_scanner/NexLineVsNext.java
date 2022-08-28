package day09_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class NexLineVsNext {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = input.nextInt();//45
        input.nextLine();//Enter
        System.out.println("Enter full name : ");
        String name = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);








    }
}
