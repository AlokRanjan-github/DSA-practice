public class removeLL {
    
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
    public Node head;
    public Node tail;
    
    public static int size;

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

    public void toFormCycle(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.next = head.next.next;
        return;
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
    // Palindrome Linked List checking
    
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){

        if (head ==null || head.next==null) {
            return true;
        }
        Node midNode = findMidNode(head);

        Node prev = null;
        Node current = midNode;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node rightHead = prev;
        Node leftHead = head;



        while (rightHead != null) {
            if (leftHead.data != rightHead.data) {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    // Time complexity O(n^2)

    // public void toRemoveCycle(){
    //     Node slow = head;
    //     Node fast = head;
    //     Node prev;

    //     while (fast !=null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if (slow == fast) {
    //             slow = head;
    //             while (slow != fast) {
    //                 slow = slow.next;
    //                 prev = fast;
    //                 fast = fast.next;
    //                 if (slow == fast) {
    //                     prev.next = null;
    //                     return;
    //                 }
    //             }
    //         }
    //     }
    // }

    // Time complexity O(n^2)
    public void toRemoveCycle2(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }


    public static void main(String[] args){
        removeLL LL = new removeLL();
        LL.addFirst(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.addLast(40);
        LL.addLast(50);
        // LL.toFormCycle(60);
        // LL.print();
        // LL.nthFromLast(4);
        // LL.print();
        // System.out.println(LL.isPalindrome());
        System.out.println(LL.isCycle());
        // LL.toRemoveCycle();
        LL.toRemoveCycle2();
        LL.print();
    }

}
