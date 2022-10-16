package day30_inheritanceContinue.phoneTask;

public class Nokia extends Phone{


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " can be used for self defenses");

    }
}
/*2.3 Nokia:
					Extra methods:
						selfDefense()*/