import java.util.PriorityQueue;

public class weakestSoldier {
    public static class Soldier implements Comparable<Soldier> {
        int count;
        int index;

        Soldier(int count, int index) {
            this.count = count;
            this.index = index;
        }

        @Override
        public int compareTo(Soldier s2) {
            if (this.count == s2.count) {
                return this.index - s2.index;
            } else {
                return this.count - s2.count;
            }
        }
    }

    public static void main(String[] args) {
        int[][] army = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        PriorityQueue<Soldier> pq = new PriorityQueue<>();
        int k = 2; // how many weakest army u want to print

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Soldier(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("Army:"+ pq.remove().index);
        }
    }
}
