import java.util.*;

public class QusingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>(); // LinkedList-based queue
        Queue<Integer> queue2 = new ArrayDeque<>(); // More efficient for queues
        Queue<Integer> queue3 = new PriorityQueue<>(); // Priority-based queue

        q.add(10);
        q.add(20);
        q.add(30);
        // System.out.println( q.peek());
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.remove());
        // both poll and remove works similar but key difference is that when .Remove is
        // called for empty queue is show "exception" while .Poll returns "null"
    }
}
