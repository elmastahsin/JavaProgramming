package day26_statics;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");

    }
    public ConstructorCalls(int a){
        //this();
        this("ADS");
        System.out.println("Constructor with int argument");
        //this();

    }
    public ConstructorCalls(double a){
        System.out.println("Constructor with double argument");

    }
    public ConstructorCalls(String a){
        this(2.5);
        System.out.println("Constructor with double argument");

    }
    public static void main(String[] args) {
        method1();
        System.out.println("****************");
        method2();
    }
   public static void method1(){
       System.out.println("Method 1");
   }
   public static void method2(){
       method1();
   }
}
