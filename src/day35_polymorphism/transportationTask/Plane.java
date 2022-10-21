package day35_polymorphism.transportationTask;

import java.security.PublicKey;

public abstract class Plane extends Transportation{
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    public abstract void land();
}
/*
	6. Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()
					*/