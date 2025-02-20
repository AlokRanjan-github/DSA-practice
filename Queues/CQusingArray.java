public class CQusingArray {
    private int[] arr;
    private int front, rear, capacity;

    public CQusingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front ==-1 && rear==-1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is overflowing");
            return;
        }
        if (front ==-1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        System.out.println("Added: " + data);

    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        // Single element is present in Queue
        if ((front + 1) % capacity == rear) {
            System.out.println("Removed: " + arr[front]);
            front = rear = -1;
        } else {
            System.out.println("Removed: " + arr[front]);
            front = (front + 1) % capacity;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Peeked: " + arr[front]);
    }

    public static void main(String[] args) {
        CQusingArray cq = new CQusingArray(5);
        cq.add(10);
        cq.peek();
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.add(60);
        cq.add(70);
        cq.remove();
        cq.peek();
        cq.add(80);
        cq.add(90);
    }
}
