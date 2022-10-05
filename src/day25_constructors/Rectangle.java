package day25_constructors;

public class Rectangle {

    public double length, width;

    public double area(){
        return length*width;
    }

public void setInfo(double length, double width){
this.width=width;
this.length=length;
}
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
