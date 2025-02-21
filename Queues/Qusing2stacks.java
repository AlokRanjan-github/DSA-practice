import java.util.*;

public class Qusing2stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        System.out.println("Added: " + data);
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Removed: "+s1.pop());
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Peeked: " +s1.peek());

    }
    public void removeAllElementsOfQ(){
        while (!s1.isEmpty()) {
            System.out.println("Removed: "+ s1.pop());
        }
    }

    public static void main(String[] args) {

        Qusing2stacks q = new Qusing2stacks();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        // q.remove();
        // q.peek();
        q.removeAllElementsOfQ();
        
    }

}
