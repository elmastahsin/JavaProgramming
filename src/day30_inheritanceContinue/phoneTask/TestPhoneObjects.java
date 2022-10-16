package day30_inheritanceContinue.phoneTask;


public class TestPhoneObjects {
    public static void main(String[] args) {


        IPhone iphone14 = new IPhone("Iphone14", "Large", "Black", 1000);

        Samsung samsung = new Samsung("s35", "Small", "Gold", 500);

        Nokia nokia1 = new Nokia("S65", "small", "Silver", 200);

        iphone14.call(911);
        samsung.call(911);
        nokia1.call(911);


        iphone14.text(911);
        samsung.text(911);
        nokia1.text(911);

        System.out.println("----------------");

        iphone14.faceTime(123456);
       // samsung.faceTime(123456);
     //   nokia1.faceTime(123456);



        samsung.freeze();
       // iphone14.freeze();
      //   nokia1.freeze();

        nokia1.selfDefense();
       // iphone14.selfDefense();
        // samsung.selfDefense();


        System.out.println("-----------");
        System.out.println(iphone14);
        System.out.println(samsung);
        System.out.println(nokia1);
    }
}
