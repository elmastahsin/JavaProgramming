package day27_accessModifers;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);

        System.out.println(circle1);

        Circle circle2 = new Circle(5);

        System.out.println(circle2);

        Circle circle3 = new Circle(7);

        System.out.println(circle3);

       /* System.out.println(circle1.pi);
        System.out.println(circle2.pi);  not preferred way
        System.out.println(circle3.pi);*/

        System.out.println(Circle.pi);
        // System.out.println(Circle.radius); Class cannot access the object instance variables

        System.out.println(circle1.radius);
        System.out.println(circle2.radius);
        System.out.println(circle3.radius);


    }
}
