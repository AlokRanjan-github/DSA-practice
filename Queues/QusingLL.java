public class QusingLL {
    public class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return (tail == null && head == null);
    }

    public void add(int data){
        //Single element
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            System.out.println("Added: "+data);
        }
        else{
            tail.next = newNode;
            tail = newNode;
            System.out.println("Added: "+data);
        }
    }

    public void remove(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        //Single Element;
        if (head == tail) {
            int removed = head.data;
            head = tail = null;
            System.out.println("Removed: " + removed);
            return;
        } else{
            int removed = head.data;
            head = head.next;
            System.out.println("Removed: " + removed);
        }
    }
    
    public void peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Peeked: "+ head.data);
    }
    public static void main(String[] args) {
        QusingLL qll = new QusingLL();
        System.out.println(qll.isEmpty());
        qll.add(10); 
        qll.add(20); 
        qll.add(30); 
        qll.add(40); 
        qll.add(50); 
        qll.remove();
        qll.peek(); 
    }
    
}
