public class linkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    public static int size;

    // Constructor for linkedList class
    public linkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        // Create a new Node using the linkedList instance
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);
        int currIndex = 0;
        Node currNode = head;

        if (index == 0) {
            addFirst(data);
            return;
        }

        while (currIndex < index - 1) {
            currNode = currNode.next;
            currIndex++;
        }

        // i=inde-1
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    // public void sizeOfLL(){
    // Node temp = head;
    // int counter=0;
    // while(temp != null){
    // temp = temp.next;
    // counter++;
    // }
    // System.out.println(counter);
    // }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int removed = head.data;
            head = tail = null;
            size =0;
            return removed;
        } else {
            int removed = head.data;
            head = head.next;
            size--;
            return removed;
        }

    }

    public int removeLast(){
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        else{
            Node prev = head;
            int currIndex = 0;
            
            while (currIndex < size-2) {
                prev = prev.next;
                currIndex++;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }

    //Recurrsive search
    public int helper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index+1;
    }
    public int recurrsiveSearch(int key){
        return helper(head, key);
    }

    //Reversing a linked list

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList(); // Create an instance of linkedList

        // Add nodes to the list
        ll.printLL();
        ll.addFirst(20);
        // ll.printLL();
        ll.addFirst(10);
        // ll.printLL();
        ll.addLast(30);
        // ll.printLL();
        ll.addLast(40);
        // ll.printLL();
        ll.addMiddle(2, 80);
        ll.printLL();

        // System.out.println("Size of linkedList: " + size);
        // ll.removeFirst();
        // ll.printLL();
        // System.out.println("After removing size of linkedList: " + size);
        // ll.removeLast();
        // ll.printLL();

        // System.out.println(ll.recurrsiveSearch(40));
        // System.out.println(ll.recurrsiveSearch(1000));

        ll.reverseLinkedList();
        ll.printLL();



    }
}
