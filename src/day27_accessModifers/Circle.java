package day27_accessModifers;

public class Circle {
    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(double radius, double pi) {
        return radius * radius * pi;
    }

    public double calcPerimeter(double radius, double pi) {
        return 2 * radius * pi;
    }

    public void printPi(double pi) {
        System.out.println(pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi =" + pi +
                ", area=" + calcArea(radius, pi) +
                ", perimeter=" + calcPerimeter(radius, pi) +
                '}';
    }
}
/*Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and
			perimeter of the circle when the object of circle is passed in the print statement
*/