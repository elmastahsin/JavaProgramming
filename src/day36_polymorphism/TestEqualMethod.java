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

        System.out.println("----------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Red", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);


        System.out.println( iphone1.equals(iphone2) );

    }
}
