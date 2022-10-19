package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent {
    public final void language() {
        System.out.println("Java Programming");
    }

}


public class FinalKeyword extends CydeoStudent {
    /*@Override
    public void language() { // final method can never be overridden
        System.out.println("Pyhton Programming");
    }*/

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

        // gender = 'F';

        System.out.println(gender);


        System.out.println("--------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        new CydeoStudent().language();
        new FinalKeyword().language();


        System.out.println("--------------------");


        final String name = "James"; // if you want to don't be eligible for garbage collection;

        //    name = null // makes String object eligible for garbage collection;

        //name = "Daniel"; // makes "James" oblet eligible for garbage collection;

        System.out.println(name);


    }
}
