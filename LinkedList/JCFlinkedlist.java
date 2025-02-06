import java.util.LinkedList;

public class JCFlinkedlist {
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

    public JCFlinkedlist() {
        Node head = null;
        Node tail = null;
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

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Sort left and right halves
        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);

        // Merge sorted halves
        return merge(leftHalf, rightHalf);
    }

    // ZigZag Linked list

    public Node findMid(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node zigZag(Node head){
        Node mid = findMid(head);

        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        
        Node NextLeft;
        Node NextRight;

        while (leftHead != null && rightHead != null ) {
            NextLeft = leftHead.next;
            NextRight = rightHead.next;
            leftHead.next = rightHead;
            rightHead.next = NextLeft;

            leftHead = NextLeft;
            rightHead = NextRight;
        }
        return head;

    }

    public static void main(String[] args) {
        JCFlinkedlist LL = new JCFlinkedlist();
        LL.addLast(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.addLast(40);
        LL.addLast(50);
        LL.printLL();
        LL.zigZag(LL.head);
        // LL.head = LL.mergeSort(LL.head);

        LL.printLL();
    }
}
