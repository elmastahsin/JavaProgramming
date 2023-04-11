package day11_string;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "METU SCHOOL ";
        str1 = str1.toLowerCase(); // METU school
        System.out.println(str1);
        System.out.println("*********************");

        String str2 = "java programming language";
        str2 = str2.toUpperCase();
        System.out.println(str2);

        System.out.println("*************************");

        String word = "Wooden Spoon";
        word = word.toUpperCase();
        word = word.toLowerCase();
        System.out.println(word);

        System.out.println("*************************");

        String str4 = "                 METU School";
        System.out.println("str4 = " + str4.trim());

        System.out.println("*************************");

        String sentence = "Today is Sunday, and we have Java Class";
        int index1 = sentence.indexOf('w');
        System.out.println("index1 = " + index1);
        String s1 = "I Love Java Programming";
        int fisrtA = s1.indexOf('a');
        System.out.println("fisrtA = " + fisrtA);
        int secondA = s1.indexOf("a ");

        String s2 = "Java Python JavaScript METU Python";
        int a1 = s2.indexOf('a');
        System.out.println("a1 = " + a1);
        int a2 = s2.indexOf("a Python");
        System.out.println("a2 = " + a2);
        int a3 = s2.indexOf("avaS");
        System.out.println("a3 = " + a3);
        int a4 =s2.indexOf("aS");
        System.out.println("a4 = " + a4);

        System.out.println("*************************");


        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3

        String w2 = "Java Python JavaScript METU Python";


        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));




    }
}
