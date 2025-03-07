
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
    //Approach 1
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

    //Approach 2
    public static class Info{
        int diameter;
        int height;

        Info(int dia, int ht){
            this.diameter = dia;
            this.height = ht;
        }
    }
    public static Info diameter(Node root){
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1);
        int ht = Math.max(leftInfo.height, rightInfo.height)+1;

        return new Info(dia, ht);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = buildTree(nodes);
        System.out.println("Root nodes: " + root.data);

        System.out.println("Height of tree: " + height(root));

        Info diameterInfo = diameter(root);

        System.out.println("Diameter of tree: " + diameterInfo.diameter);
    }

}
