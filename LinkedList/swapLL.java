import java.util.*;

public class swapLL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    Node head;
    swapLL(){
        this.head = null;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void addLast(int data){
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

    public void swappingLinkedList(int x, int y){
        Node prevX=null,prevY=null;
        Node currX,currY;
        currX = head;
        while (currX !=null && currX.data != x ) {
            prevX = currX;
            currX = currX.next;
        }

        currY = head;
        while (currY !=null && currY.data != y ) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null) {
            return;
        }
        
        if (prevX == null) {
            head = currY;
        }
        else{
            prevX.next = currY;
        }
        if (prevY == null) {
            head = currX;
        }
        else{
            prevY.next = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void main(String[] args) {
        swapLL LL = new swapLL();
        LL.addLast(0);
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);

        LL.print();
        
        LL.swappingLinkedList(2, 4);
        
        LL.print();

    }
}
