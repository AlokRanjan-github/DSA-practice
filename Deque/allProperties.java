import java.util.LinkedList;
import java.util.Deque;

public class allProperties {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);

        // addFirst() 
        // addLast()
        // offerFirst()
        // offerLast()

        // removeFirst()
        // removeLast()
        // pollFirst()
        // pollLast()

        // getFirst()
        // getLast()
        // peekFirst()
        // peekLast()

        dq.removeFirst();
        dq.removeLast();
        System.out.println("First element peeked: " + dq.getFirst());
        System.out.println("Last element peeked: " + dq.getLast());

        System.out.println(dq);
    }
}
