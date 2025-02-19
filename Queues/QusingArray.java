public class QusingArray {
    private int arr[];
    private int front, rear, capacity, size;

    public QusingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size=0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void add(int data){
        if (isFull()) {
            System.out.println("Queue is Overflowing");
            return;
        }
        rear = (rear+1)%capacity;
        arr[rear] = data;
        System.out.println("Added :"+data);
        size++;
    }
    
    public void remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int removedFront = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear = (rear -1);
        System.out.println("Removed: "+removedFront);
        size--;
    }

    public void peek(){
        if (isEmpty()) {
            System.out.println("Nothing left to peek");
            return;
        }
        System.out.println("Peeked: "+ arr[front]);
    }

    public static void main(String[] args) {
        QusingArray q = new QusingArray(5);
        System.out.println(q.isEmpty());
        q.add(10);
        q.peek();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.remove();
        q.peek();
        q.add(80);
        q.add(90);
    }
}
