package day26_statics;

public class Iphone {
    public static String brand = "Apple";
    public String model;
    public double price;
    public String color;
    public static String OS = "IOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    /*
    public static void printPhoneInfo(){ // static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
    */

    public Iphone(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public void printPhoneInfo() { // instance methods accepts both static and none static
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }

}
/*
 * Attributes;
 * brand
 * color
 * model
 * price
 * OS
 * madeIn
 * hasBattery
 * hasTouchScreen
 * isEcpensivetoFix
 * */