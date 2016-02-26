//: QueueDemo.java
// Upcasting to a Queue from a LinkedList.
package c11;

import java.util.*;

public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        System.out.println(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
