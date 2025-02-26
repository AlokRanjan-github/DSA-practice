import java.util.*;

public class StackusingDQ {
    public static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
            System.out.println("Added: " + data);
        }
        public void pop(){
            // System.out.println("Removed: " + dq.removeLast());
            System.out.println("Removed: " + dq.pollLast());
        }
        public void peek(){
            // System.out.println("Peeked: " + dq.getLast());
            System.out.println("Peeked: " + dq.peekLast());
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        
    }
}
