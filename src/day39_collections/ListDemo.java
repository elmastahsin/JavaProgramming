package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // Array based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);
        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class(Doubly linked list)===> add() ,addAll(),remove(), removeAll()

        linkedList.add(100);
        linkedList.add(300);
        linkedList.add(400);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("-----------------------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100); // synchronized list so only one thread execute at the time
        vector.add(200);
        vector.add(300);

        vector.get(0);


        System.out.println("-----------------------------------------------------------------------------");
        Stack<Integer> stack = new Stack<>(); // synchronized  Last in first out UNIQUE JUST FOR STACK CLASS

        stack.add(100);
        stack.add(200);
        stack.add(400);
        System.out.println(stack);

        int lastElement =  stack.pop();

        System.out.println(stack);

        int secondElement= stack.pop();

        System.out.println(secondElement);



    }
}
