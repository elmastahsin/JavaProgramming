package day36_polymorphism;



import day30_inheritanceContinue.phoneTask.IPhone;
import day30_inheritanceContinue.phoneTask.Nokia;
import day30_inheritanceContinue.phoneTask.Phone;
import day30_inheritanceContinue.phoneTask.Samsung;

public class PolymorphismPractice {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {


//Phone phone =  new Samsung("Galaxy S20", "Large", "Silver", 850);


        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Black", 350),
                new Nokia("G10", "Medium", "Gold", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };

        for (Phone eacphone : phones) {
            System.out.println(eacphone.getModel() + " - " + eacphone.getColor() + " - " + eacphone.getPrice());
        }

        System.out.println("------------------------------------------------------------------");

        int countIphone = 0;
        int countSamsung = 0;
        int countNokia =0;

        for (Phone each : phones) {
            if (each instanceof IPhone){
                countIphone++;
                            }
            if (each instanceof Samsung){
                countSamsung++;
            }
            if (each instanceof Nokia){
                countNokia++;
            }
        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);
        System.out.println("countNokia = " + countNokia);

        System.out.println("------------------------------------------------------------------");


        for (Phone each : phones         ) {
            if (each instanceof IPhone || each instanceof Samsung){ // if the phone is iphone or samsung
                if (each.getPrice()>= 700 ){
                    System.out.println(each.getModel());
                }
            }
        }








    }
}
