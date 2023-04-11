package day31_inheritance;

public class FieldHiding extends A {
     public int a =200;

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);
    }

}
