package day30_inheritanceContinue.phoneTask;

public class IPhone extends Phone { // Iphone is a phone


    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public static boolean hasApplePay = true;


    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is facetiming with " + phoneNumber);

    }
    public void faceTime(String email){
        System.out.println(getModel() + " is facetiming with " + email);

    }
}
/*2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)





*/