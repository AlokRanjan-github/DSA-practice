import java.util.PriorityQueue;

public class slidingWindowPQ {
    public static class Pair implements Comparable<Pair> {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val-this.val;
        }
    }
    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 1, 3, 1, -3, 5, 3,6, 7};
        int[] res = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val;
        for (int i = k; i < arr.length; i++) {
            while (pq.peek().index <= i-k && pq.size()>0) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
