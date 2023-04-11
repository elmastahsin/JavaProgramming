package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition = false;

        for (; condition ;){
            System.out.println("Hello METU   --- For Loop");
        }

        System.out.println("-------------------------------------");

        while(condition){
            System.out.println("Hello METU  --- While Loop");
        }

        System.out.println("-------------------------------------");

        do{
            System.out.println("Hello METU  --- Do&While Loop");
        }while (condition);


    }
}
