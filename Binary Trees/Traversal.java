
public class Traversal {

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

    public static Node addNode(int[] nodes) {
        index++;
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = addNode(nodes);
        newNode.right = addNode(nodes);

        return newNode;
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1}; 

        Node root = addNode(nodes);

        if (root != null) {
            System.out.println("Root node value: " + root.data);
        } else {
            System.out.println("Tree is empty.");
        }

        System.out.println("PreOrder Traversal:");
        preOrder(root);

        System.out.println("\nInOrder Traversal:");
        inOrder(root);

        System.out.println("\nPostOrder Traversal:");
        postOrder(root);
        
        System.out.println("\nlevelOrder Traversal:");
        levelOrder(root);

    }
}
