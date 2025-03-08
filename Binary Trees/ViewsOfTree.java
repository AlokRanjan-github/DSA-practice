import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ViewsOfTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Index {
        int value = 0;
    }

    public static Node buildTreeHelper(int[] nodes, Index ind) {
        if (ind.value >= nodes.length || nodes[ind.value] == -1) {
            ind.value++;
            return null;
        }

        Node newNode = new Node(nodes[ind.value]);
        ind.value++;
        newNode.left = buildTreeHelper(nodes, ind);
        newNode.right = buildTreeHelper(nodes, ind);
        return newNode;

    }

    public static Node buildTree(int[] nodes) {
        Index ind = new Index();
        return buildTreeHelper(nodes, ind);
    }

    // Top View
    public static class Pair {
        Node node;
        int hz;

        Pair(Node node, int hz) {
            this.node = node;
            this.hz = hz;
        }

    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> topviewMap = new HashMap<>();
        int min = 0, max = 0;

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair currPair = q.remove();

            if (!topviewMap.containsKey(currPair.hz)) {
                topviewMap.put(currPair.hz, currPair.node.data);
            }

            min = Math.min(currPair.hz, min);
            max = Math.max(currPair.hz, max);

            if (currPair.node.left != null) {
                q.add(new Pair(currPair.node.left, currPair.hz - 1));
            }
            if (currPair.node.right != null) {
                q.add(new Pair(currPair.node.right, currPair.hz + 1));
            }
        }
        System.out.println("Top View of the tree:");
        for (int i = min; i <= max; i++) {
            System.out.print(topviewMap.get(i) + " ");
        }
    }

    public static void bottomView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> bottomViewMap = new HashMap<>();

        q.add(new Pair(root, 0));
        int minHz = 0, maxHz = 0;

        while (!q.isEmpty()) {
            Pair currPair = q.remove();

            bottomViewMap.put(currPair.hz, currPair.node.data);

            minHz = Math.min(minHz, currPair.hz);
            maxHz = Math.max(maxHz, currPair.hz);

            if (currPair.node.left != null) {
                q.add(new Pair(currPair.node.left, currPair.hz - 1));
            }
            if (currPair.node.right != null) {
                q.add(new Pair(currPair.node.right, currPair.hz + 1));
            }
        }
        System.out.println("\nBottom View of the tree:");
        for (int i = minHz; i <= maxHz; i++) {
            System.out.print(bottomViewMap.get(i) + " ");
        }
    }

    public static void leftView(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        System.out.println("\nLeft View of the tree:");
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node currNode = q.remove();
                if (i==0) {
                    System.out.print(currNode.data+" ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void rightView(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        System.out.println("\nRight View of the tree:");
        
        while (!q.isEmpty()) {
            int levelSize = q.size();
            
            for (int i = 0; i < levelSize; i++) {
                Node currNode = q.remove();
                if (i == levelSize-1) {
                    System.out.print(currNode.data+" ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = buildTree(nodes);

        levelOrder(root);

        topView(root);
        bottomView(root);
        leftView(root);
        rightView(root);

    }
}
