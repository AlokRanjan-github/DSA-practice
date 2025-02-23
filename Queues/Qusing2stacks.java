import java.util.*;

//Using Efficient pop&peek O(n) and costly push
public class Qusing2stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }
    // Costly push operation 
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




//Using efficent Push O(n) and costly remove&peek
public class Qusing2stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public void add(int data) {
        s1.push(data);
        System.out.println("Added: " + data);
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        System.out.println("Removed: " + s2.pop());

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        System.out.println("Peeked: " + s2.peek());
    }

    public static void main(String[] args) {
        Qusing2stacks q = new Qusing2stacks();
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.peek();
        q.remove();;
        q.peek();
        q.remove();
        q.remove();
        q.peek();
        q.remove();
        q.remove();
        q.peek();
    }
}
