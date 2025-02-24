import java.util.LinkedList;
import java.util.Queue;

// Efficient Push O(1) but POP & Peek O(n)
public class Stackusing2Q {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int data) {
        q1.add(data);
        System.out.println("Pushed: "+data);
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        //All element are moved from q1 to q2 utill we find the last element
        while (!q1.size()>1) {
            q2.add(q1.poll());
        }
        //Found last element which is to be popped
        System.out.println("Popped: "+q1.poll());

        //Swap the queues make q2 as q1
        Queue<Integer> temp = q1
        q1 = q2;
        q2 = temp;
    }

    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        //All element are moved from q1 to q2 utill we find the last element
        while (!q1.size()>1) {
            q2.add(q1.poll());
        }
        //Found last element which is to be peeked
        System.out.println("Popped: "+q1.peek());
        q2.add(q1.poll());

        //Swap the queues make q2 as q1
        Queue<Integer> temp = q1
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {
        Stackusing2Q s = new Stackusing2Q();
        s.push(20);
        s.push(40);
        s.push(60);
        s.push(80);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

    }
}

// Efficient Push O(n) but POP&Peek O(1)
public class Stackusing2Q {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(data);
        System.out.println("Added: " + data);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }

    }

    public void pop() {
        System.out.println("Popped: " + q1.poll());
    }

    public void peek() {
        System.out.println("Popped: " + q1.peek());

    }

    public static void main(String[] args) {
        Stackusing2Q s = new Stackusing2Q();
        s.push(20);
        s.push(40);
        s.push(60);
        s.push(80);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}