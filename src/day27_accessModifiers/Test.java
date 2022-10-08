package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("---------------------------");

        System.out.println(AccessModifiers.publicData); // public accessible the same package
        System.out.println(AccessModifiers.protectedData);// protected accessible the same package
        System.out.println(AccessModifiers.defaultData);// default is  accessible in the same packages
        //System.out.println(AccessModifiers.privateData); // private is only accessible in the same class

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.defaultMethod();
        AccessModifiers.protectedMethod();
        //AccessModifiers.privateMethod();
    }
}
