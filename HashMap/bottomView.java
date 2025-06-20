import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bottomView {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Pair{
        Node node;
        int hz;

        public Pair(Node node , int hz) {
            this.node = node;
            this.hz = hz;
        }
        
    }
    public static void bottomview(Node root){
        if (root == null) {
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        int maxhz = 0;
        int minhz = 0;
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair currPair = q.poll();

            maxhz = Math.max(currPair.hz, maxhz);
            minhz = Math.min(currPair.hz, minhz);

            
            map.put(currPair.hz, currPair.node.data);

            if (currPair.node.left != null) {
                q.add(new Pair(currPair.node.left, currPair.hz-1));
            }
            if (currPair.node.right != null) {
                q.add(new Pair(currPair.node.right, currPair.hz+1));
            }
            

            for (int i = minhz; i <= maxhz; i++) {
                System.out.println(map.get(i)+ " ");
            }
        }

    }
}
