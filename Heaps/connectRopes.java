import java.util.*;
public class connectRopes {
    public static void main(String[] args) {
        // int[] ropes = {3,4,2,5,6,9};
        // int[] ropes = {4,3,2,6};
        int[] ropes = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost=0;
        while (pq.size()>1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            pq.add(min1+min2);
            cost += min1+min2;
        }
        System.out.println("Cost: "+cost);

    }
}
