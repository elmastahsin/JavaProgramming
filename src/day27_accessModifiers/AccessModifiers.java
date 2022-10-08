package day27_accessModifiers;

public class AccessModifiers {
    public AccessModifiers() {

    }

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData;

    private static int privateData = 500;

    public static void publicMethod() {

    }

    protected static void protectedMethod() {

    }

    static void defaultMethod() {

    }

    private static void privateMethod() {

    }


    public static void main(String[] args) {
        System.out.println(publicData);// public accessible the same class
        System.out.println(protectedData);// public accessible the same class
        System.out.println(defaultData);// default is  accessible int the same class
        System.out.println(privateData); // private is only accessible in the same class

        new AccessModifiers();


        AccessModifiers.publicMethod();
        AccessModifiers.defaultMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.privateMethod();

    }


}
