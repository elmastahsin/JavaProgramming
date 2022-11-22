package day36_polymorphism;

public class TestEqualMethod {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);
        System.out.println(circle1 == circle2); // False
        //  System.out.println(circle1.equals("Java")); // System exit 1// False
        System.out.println(circle1.equals(circle2)); // TRUE
        System.out.println(circle1.equals(circle3)); // False
    }
}
