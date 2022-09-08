package day18_garbageCollection;

public class Pizza {


    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public double calcCost() {
        double total = 0;
        switch (size) {
            case 'S':
            case 's':
                total = 10 + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                total = 12 + 2 *(numberOfCheeseTopping+numberOfPepperoniTopping) ;
                break;
            case 'L':
            case 'l':
                total = 14 + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping) ;
                break;
            default:
                System.err.println("Invalide size : " + size);

        }
        return total;
    }

    /*public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=" + calcCost() +
                '}';
    }*/
}
