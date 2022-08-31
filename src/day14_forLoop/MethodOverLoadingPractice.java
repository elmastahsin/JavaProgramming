package day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(10,45));
        System.out.println(sum(23,234,43));
        System.out.println(sum(32,12,56,687));
        System.out.println(sum(32.23, 23.32));
        System.out.println(sum(23.2,123.32,324.34));
        System.out.println(sum(12.34,4364.463,345.435,453.45));
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
    public static double sum (double n1, double n2){
        return n1+n2;
    }
    public static double sum (double n1, double n2,double n3){
        return sum(n1,n2)+ n3;
    }
    public static double sum (double n1, double n2,double n3,double n4){
        return sum(n1,n2,n3)+ n4;
    }



}
