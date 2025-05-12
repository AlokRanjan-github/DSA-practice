public class reorderLInkedList {
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
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(Node head){
        Node mid = findMidNode(head);  
    }
}
