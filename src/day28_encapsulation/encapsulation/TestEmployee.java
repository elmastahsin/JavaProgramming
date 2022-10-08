package day28_encapsulation.encapsulation;

public class TestEmployee {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();
        // employee1.salary = -200000;

        employee1.setSalary(11111);
        System.out.println(employee1.getSalary());

       // employee1.setName("Tyson");
        System.out.println(employee1.getName());
*/

        Employee employee1= new Employee("Mike",30,"Java Developer",2999999);
        System.out.println(employee1);



    }
}
