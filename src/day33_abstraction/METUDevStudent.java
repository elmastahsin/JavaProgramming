package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class METUDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }

    public METUDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge() < 18) {
            System.err.println("METU Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (!(batchName.equalsIgnoreCase("Alumni Dev") || batchName.equalsIgnoreCase("Zero to Hero"))) {
            System.err.println("Invalid batch name: " + batchName + " \n no such a batch in METU");
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + " \n Batch number cannot be zero or negative");
            System.exit(1);

        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }


    @Override
    public String toString() {
        return "METUDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
/*1. Create a sub class of Person (from day32 package) named METUDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
*/