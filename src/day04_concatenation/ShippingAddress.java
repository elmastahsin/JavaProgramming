package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Aoron Kissinger",
                buildingNumber = "13621A",
                streetName = "Legacy Circle",
                city = "Fairfax",
                state = "VA",
                zipCode = "22030A";


        System.out.println("Your Shipping address is:\n\t" + name + "\n\t" + buildingNumber + " " + streetName +
                "\n\t" + city + ", " + state + " " + zipCode);

        System.out.println("--------------------------");

        // more clear one

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name );
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + ", " + state + " " + zipCode);

    }
}
