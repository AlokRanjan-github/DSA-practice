import java.util.LinkedList;
import java.util.Queue;

public class sumOfNode {

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

    public static int SumOfNode(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = SumOfNode(root.left);
        int rightSum = SumOfNode(root.right);
        int total = leftSum+rightSum+root.data;
        return total;
    }


    
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };

        Node root = buildTree(nodes);
        System.out.println("Root Node: " + root.data);

        System.out.println("Sum of Nodes: "+SumOfNode(root));
    }
}
