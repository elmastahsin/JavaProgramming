package day38_exceptionsContinue;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws Exception {
//method1();
        method2();

        Library.sleep(3.5);
    }

    public static void pause5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pause5Seconds();
        System.out.println("Hello METU");
    }
    public static void method2() throws InterruptedException,FileNotFoundException {
        System.out.println("First Program started");
        Thread.sleep(2000);

        System.out.println("First Program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }
}
