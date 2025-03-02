import java.util.LinkedList;
import java.util.Queue;

public class countNodes {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static Node buildTree(int[] nodes) {
        index++;
        if (index >= nodes.length ||nodes[index] == -1 ) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }


    public static int NoOfNodes(Node root){
        if (root == null) {
            return 0;
        }

        int left = NoOfNodes(root.left);
        int right = NoOfNodes(root.right);

        return left+right+1; // left + right + self root node
    }

    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }

        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
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
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };

        Node root = buildTree(nodes);
        System.out.println("Root Node: " + root.data);

        System.out.println("No of nodes :" + NoOfNodes(root));
        levelOrder(root);
    }
}
