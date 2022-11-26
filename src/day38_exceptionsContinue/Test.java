package day38_exceptionsContinue;

import utilities.Library;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello METU");

        //Thread.sleep(3500);
        Library.sleep(3.5);
        System.out.println("How are you today?");


        System.out.println("------------------------------------------");

        if (LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();

        }
      //  throw new RuntimeException("Something went wrong");
      //  throw new BreakTimeException("It's time to go home");
        throw new BreakTimeException("Time to go home");
    }
}
