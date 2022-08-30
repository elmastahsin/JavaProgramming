package day12_customMethods;


public class CustomMethodIntro {

    public static void main(String[] args) {

        System.out.println("Test Started!");

        greetings();

        System.out.println("Test Completed!");

        System.out.println("**********************");

        displayMessage();
    }

    public static void greetings() {
        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
        System.out.println("Are you reasy to learn Java?");
    }

    public static void displayMessage() {
        System.out.println("Hello World");
        System.out.println("I love java");
    }
}

/*Custom Methods:
		1. Void methods
		2. Parameters
		3. Return Methods
		4. Return with parameters
		5. Method Overloading
		*/