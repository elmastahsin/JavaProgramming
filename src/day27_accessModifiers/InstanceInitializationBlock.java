package day27_accessModifiers;

public class InstanceInitializationBlock {
    public String name;
    public int age;

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {
        name = "James";
        age =20;
    }

    @Override
    public String toString() {
        return "InstanceInitializationBlock{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
    /*  InstanceInitializationBlock obj1 =  new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 =  new InstanceInitializationBlock();*/


        InstanceInitializationBlock obj1 =  new InstanceInitializationBlock("Alena",23);
        InstanceInitializationBlock obj2 =  new InstanceInitializationBlock("Mike",23);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
