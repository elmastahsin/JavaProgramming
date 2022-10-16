package day30_inheritanceContinue.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand;
    private String model;
    private String size ;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }else {
            System.err.println("Price cannot be zero and negative");
            System.exit(1);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String [] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("Invalid color " + color + " color can be only: " +Arrays.toString(colors));
            System.exit(1);
        }
    }

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting");
    }
}
/*Warmup tasks:
	1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

*/