package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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







    }
}
