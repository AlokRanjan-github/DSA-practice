
// Diameter of a tree ---- No of nodes present in the largest path of a treee;
import java.util.LinkedList;
import java.util.Queue;

public class DiameterOfTree {

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
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeigth = height(root.left);
        int rightHeigth = height(root.right);

        return Math.max(leftHeigth, rightHeigth) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHeigth = height(root.left);
        int rightHeight = height(root.right);
        int diameterThruRoot = (leftHeigth + rightHeight + 1);

        return Math.max(diameterThruRoot, Math.max(rightDiameter, leftDiameter));
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
        System.out.println("Root nodes: " + root.data);

        System.out.println("Height of tree: " + height(root));

        System.out.println("Diameter of tree: " + diameter(root));
        levelOrder(root);
    }

}
