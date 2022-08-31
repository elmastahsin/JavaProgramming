package day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(10,45));
        System.out.println(sum(23,234,43));
        System.out.println(sum(32,12,56,687));
    }




    public static int sum (int n1,int n2){
        return n1+n2;
    }
    public static int sum (int n1,int n2,int n3 ){
        return sum(n1,n2)+n3;
    }
    public static int sum (int n1,int n2,int n4,int n3){
        return sum(n1,n2,n3) + n4;
    }





}
