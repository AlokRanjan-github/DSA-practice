import java.util.*;

public class QusingDQ {
    public static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
            // dq.offerLast(data);
            System.out.println("Added: "+data );
        }
        public void remove(){
            if (dq.isEmpty()) {
                System.out.println("Queue is Empty! Cannot Remove.");
                return;
            }
            System.out.println("Removed: "+ dq.removeFirst()); // throws exception when no element in Deque
            // System.out.println("Removed: "+ dq.pollFirst());
            
        }
        public void peek(){
            if (dq.isEmpty()) {
                System.out.println("Queue is Empty! Cannot peek.");
                return;
            }
            System.out.println("Peeked: "+ dq.getFirst());  // throws exception when no element in Deque
            // System.out.println("Peeked: "+ dq.peekFirst());
        }
    } 

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.peek();
        q.remove();
    }
}
