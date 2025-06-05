
// Implementing heap insertion in form of array rather than using classses to reduce the time complexity
import java.util.*;

public class insertion {

    public class Heap {
        ArrayList<Integer> heap = new ArrayList<>();

        
        public void insert(int data) {
            heap.add(data);
            int child = heap.size() - 1;
            int parent = (child - 1) / 2;

            while (child > 0 && heap.get(child) < heap.get(parent)) {
                int temp = heap.get(child);
                heap.set(child, heap.get(parent));
                heap.set(parent, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
            System.out.println("Added: " + data);
        }

        public void peek(){
            System.out.println("Peeked: "+ heap.get(0)); 
        }

        public int delete(){
            //step -1 swap first and last element of the heap
            int temp = heap.get(0);  
            heap.set(0, heap.get(heap.size()-1));
            // heap.set(heap.size()-1, temp);

            // step -2 Delete last element of the heap in O(1)
            heap.remove(heap.size()-1);

            //step -3 Recovering the heap using Heapify
            heapify(0);
            return temp;

        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if (left<heap.size() && heap.get(left)<heap.get(minIdx)) {
                minIdx = left;
            }
            if (right<heap.size() && heap.get(right)< heap.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                int temp = heap.get(i);
                heap.set(i, heap.get(minIdx));
                heap.set(minIdx, temp);
                
                heapify(minIdx);
        
            }
        }

        public boolean isEmpty(){
            return heap.size() == 0;
        }

    }

    public static void main(String[] args) {
        insertion outer = new insertion();
        Heap hp = outer.new Heap();
        hp.insert(10);
        hp.insert(44);
        hp.insert(55);
        hp.insert(1);

        while (!hp.isEmpty()) {
            System.out.println(hp.delete());
        }

    }
}
