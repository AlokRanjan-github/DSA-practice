import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Qreversal {
    public static void reverse(Queue<Integer> q) {
        System.out.println("Queue Before:");
        for (Integer num : q) {
            System.out.print(num + " ");
        }
        Stack<Integer> s = new Stack<>();

        int size = q.size();
        for (int i = 0; i < size; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println("\nQueue After:");
        for (Integer num : q) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
    }
}
