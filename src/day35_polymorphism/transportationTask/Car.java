package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation{
    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    public abstract void drive();
}
/*	5. Create an abstract subclass of Transportation named Car

				extra methods:
					drive()
*/