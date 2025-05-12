import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Function to build a tree from level-order input
    public void buildTree(int[] values) {
        if (values == null || values.length == 0) return;

        root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < values.length; i++) {
            Node current = queue.poll();

            current.left = new Node(values[i]);
            queue.offer(current.left);
            i++;

            if (i < values.length) {
                current.right = new Node(values[i]);
                queue.offer(current.right);
            }
        }
    }

    // Function for inorder traversal
    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
}

class RecoverBST {
    private Node first, second, prev;

    // Function to recover the swapped BST
    public void recoverTree(Node root) {
        first = second = prev = null;
        findSwappedNodes(root);

        // Swap the values of the two misplaced nodes
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    // Function to find misplaced nodes using inorder traversal
    private void findSwappedNodes(Node root) {
        if (root == null) return;

        findSwappedNodes(root.left);

        // Detect swapped nodes
        if (prev != null && prev.data > root.data) {
            if (first == null) first = prev;
            second = root;
        }
        prev = root; // Move prev forward

        findSwappedNodes(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Get user input for tree
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] values = new int[n];

        System.out.println("Enter tree values:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        // Build tree and display
        tree.buildTree(values);
        System.out.println("Before Recovery:");
        tree.inOrderTraversal(tree.root);

        // Fix the BST
        RecoverBST recover = new RecoverBST();
        recover.recoverTree(tree.root);

        // Display fixed BST
        System.out.println("\nAfter Recovery:");
        tree.inOrderTraversal(tree.root);
    }
}
