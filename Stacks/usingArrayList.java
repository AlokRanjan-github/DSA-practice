import java.util.ArrayList;

public class usingArrayList {
    public static ArrayList<Integer> a = new ArrayList<>();

    public static boolean isEmpty(){
        if (a.size() == 0) {
            return true;
        }
        return false;
    }

    public static void push(int data){
        a.add(data);
        System.out.println("Pushed "+ data);
    }

    public static void pop(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return ;
        }
        System.out.println("Poped "+a.get(a.size()-1));
        a.remove(a.size()-1);
    }

    public static void peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Peeked "+a.get(a.size()-1));
    }

    public static void PushAtBottom(int data){
        if (a.isEmpty()) {
            push(data);
            return;
        }
        int temp = a.remove(a.size()-1);
        PushAtBottom(data);
        push(temp);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        pop();
        pop();
        push(4);
        push(5);
        push(6);
        System.out.println(isEmpty());

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }

        System.out.println();
        peek();
        PushAtBottom(0);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}
