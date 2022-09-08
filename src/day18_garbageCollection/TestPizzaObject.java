package day18_garbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();

        Pizza pizza2 = new Pizza();

        pizza1.size = 'M';

        pizza2.setInfo('S', 1, 2);
        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("-------------------");
    }

}
