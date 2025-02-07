public class usingLinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    usingLinkedList() {
        this.head = null;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        else if (head.next == null) {
            System.out.println(head.data);
            head = null;
            return;
        }
        else{
            head = head.next;
        }
    }

    public void peek() {
        if (head == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println(head.data);
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        usingLinkedList stack = new usingLinkedList();
        stack.isEmpty();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.print();
        stack.peek();
        stack.isEmpty();

    }
}

