package day33_abstraction.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }
}
/*	Developer:
		work() { coding }*/