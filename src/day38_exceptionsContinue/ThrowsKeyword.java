package day38_exceptionsContinue;

import javax.lang.model.type.ArrayType;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program1 started");

        // System.out.println(100/0); // for unchecked exeptions USE try catch NEVER USE THROW
        //for checked USE throws or try catch
/*try{
    Thread.sleep(3000);
}catch (InterruptedException e){
    e.printStackTrace();
}*/
        System.out.println("Program1 ended");

        System.out.println("------------------------");
        System.out.println("Program2 started");

     /*   try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
        System.out.println("Program2 ended");
    }
}
