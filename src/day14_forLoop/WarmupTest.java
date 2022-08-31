package day14_forLoop;

public class WarmupTest {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "apple";
        System.out.println(combine(str1, str2));
        String s1 = "" + true;
        String s2 = "" + 'e';
        System.out.println("*****************");
        System.out.println(    sumOf2Numbers(10, 20)   );

        System.out.println( sumOf3Numbers(10, 20, 30) );

        System.out.println( sumOf4Number(10, 20, 30, 40) );

    }

    public static String combine(String str1, String str2) {
        /* Task1:
        Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight*/
        String result = str1 + str2;
        /*if (str1.endsWith("" + str2.charAt(0))) {
            result = str1 + str2.substring(1);
        }*/
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 + str2.substring(1);
        }
        return result;
    }


    public static int sumOf2Numbers(int n1, int n2){
        return n1+n2;
    }
    public static int sumOf3Numbers(int n1, int n2, int n3){
        return sumOf2Numbers(n1,n2)+n3;
    }
    public static int sumOf4Number(int n1, int n2, int n3,int n4){
// return n1 + n2 + n3 + n4;
        //  return sumOf3IntegerNumbers(n1, n2, n3) + n4;
        //  return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        //  return  sumOf2IntegerNumbers(   sumOf3IntegerNumbers(n1, n2, n3)  ,   n4 );
        return  sumOf3Numbers(   sumOf2Numbers(n1, n2)  ,  n3 ,  n4  );    }
}
   /* Warmup Tasks:


        Task 2:
        1. create a method that can find the sum of two integer numbers
        method name: sumOf2Numbers

        2. create a method that can find the sum of three integer numbers
        method name: sumOf3Numbers

        3. create a method that can find the sum of four integer numbers
        method name: sumOf4Numbers */