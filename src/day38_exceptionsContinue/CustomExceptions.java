package day38_exceptionsContinue;

public class CustomExceptions {

    public static void main(String[] args) {


        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------");


        throw new CustomUncheckedException();


    }
}
