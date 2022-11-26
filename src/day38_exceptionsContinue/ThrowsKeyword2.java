package day38_exceptionsContinue;

import utilities.Library;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {
//method1();

        Library.sleep(3.5);
    }

    public static void pause5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pause5Seconds();
        System.out.println("Hello Cydeo");
    }
}
