package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {
        Iphone iphone12= new Iphone("Iphone12",1000,"Black");
        System.out.println(iphone12.model);
        System.out.println(iphone12.color);
        System.out.println(iphone12.model);
        iphone12.printPhoneInfo();

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();

    }
}
