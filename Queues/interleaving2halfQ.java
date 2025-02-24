import java.util.LinkedList;
import java.util.Queue;

public class Interleaving2HalfQ {
    public static void interleave(Queue<Integer> q) {
        int size = q.size();
        if (size % 2 != 0) {
            System.out.println("Even length Queue only acceptable");
            return;
        }

        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            q1.add(q.remove());
        }
        while (!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
        System.out.println("After interleaving Queue");
        for (Integer num : q) {
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interleave(q);
    }
}


// My firt thought BruteForce using 2 Queues

import java.util.LinkedList;
import java.util.Queue;

public class Interleaving2HalfQ {
    public static void interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Even length Queue only acceptable");
            return;
        }
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Move first half to q1
        int halfSize = q.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            q1.add(q.poll());
        }

        // Move second half to q2
        while (!q.isEmpty()) {
            q2.add(q.poll());
        }

        // Interleave elements from q1 and q2 back into q
        while (!q1.isEmpty() && !q2.isEmpty()) {
            q.add(q1.poll());
            q.add(q2.poll());
        }

        // Print interleaved queue
        System.out.println("Printing Interleaved Queue:");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        
        interleave(q);
    }
}
