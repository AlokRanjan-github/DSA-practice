import java.util.*;

public class ReverseStack {
    public static void PushAtBottom(Stack<Integer> stack, int data){
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        PushAtBottom(stack,data);
        stack.push(temp);
    }
    public static void revStack(Stack<Integer> stack){
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        revStack(stack);
        PushAtBottom(stack, temp);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop()+" ");
        }
    }
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // printStack(stack);
        revStack(stack);
        System.out.println("After reversing Stack");
        printStack(stack);

    }
}
