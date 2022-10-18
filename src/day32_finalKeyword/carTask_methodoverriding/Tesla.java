package day32_finalKeyword.carTask_methodoverriding;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }
    public void autoPilot(){

    }
}
/*   5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()*/