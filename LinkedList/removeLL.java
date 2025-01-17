public class removeLL {
    private Node head;
    private Node tail;
    public static int size;

    public removeLL(){
        this.head = null;
        this.tail = null;
    }
    
    public class Node{
        int data;
        Node next;

        public Node( int data){
            this.data= data;
            this.next=null;
        }
    }

    public void addFirst(int data){
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

    public void addLast(int data){
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

    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        int currIndex = 0;
        Node currNode = head;
        while (currIndex < index-1) {
            currNode = currNode.next;
            currIndex++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void nthFromLast(int n){
        int index = size-n+1;
        Node prev = head;
        if (n == size) {
            System.out.println("Removed "+ head.data);
            head = head.next;
            size--;
            return;
        }
        int currIndex = 0;
        while (currIndex < index-2) {
            prev = prev.next;
            currIndex++;
        }
        System.out.println("Removed "+prev.next.data);
        prev.next = prev.next.next;

        size--;

    }

    public static void main(String[] args){
        removeLL LL = new removeLL();
        LL.addFirst(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.addLast(40);
        LL.addLast(50);
        LL.print();
        LL.nthFromLast(4);
        LL.print();
    }

}
