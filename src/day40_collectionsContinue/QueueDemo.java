package day40_collectionsContinue;

import java.util.*;
import java.util.jar.JarOutputStream;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();

        queue1.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue1.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue1.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue1.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        // queue1.addAll((Arrays.asList(null,null)));
        System.out.println(queue1);// queue order is random it does not accept null but duplicates

        int firstElement = queue1.poll(); // FIFO return first insertion and then remove it
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        System.out.println("-------------------------------------------------");
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue2.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue2.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue2.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        System.out.println(queue2);
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        System.out.println("------------------------------------------------");


        Queue<Integer> queue3 = new LinkedList<>(); // keep insertion order, accepts null, has index number

        queue3.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue3.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue3.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        queue3.addAll((Arrays.asList(10, 200, 300, 40, 90)));
        System.out.println(queue3);


        queue3.poll();
        System.out.println(queue3);

        System.out.println(((LinkedList) queue3).get(4));
        System.out.println("------------------------------------------------");
        List<Integer> list = new LinkedList<>();

        list.addAll((Arrays.asList(10, 200, 300, 40, 90)));

        System.out.println(list.get(4));
        System.out.println(list);
        ((LinkedList)list).poll();

        System.out.println(list);
    }
}
