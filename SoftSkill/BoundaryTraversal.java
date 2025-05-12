import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BoundaryTraversal {

    // Function to build a binary tree from an integer array
    static Node buildTree(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        Node root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            Node currNode = queue.poll();

            if (values[i] != -1) {
                currNode.left = new Node(values[i]);
                queue.add(currNode.left);
            }
            i++;

            if (i >= values.length) {
                break;
            }

            if (values[i] != -1) {
                currNode.right = new Node(values[i]);
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    // Function to perform boundary traversal of the tree
    static void boundaryTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " "); // Print root (not part of left/right boundary)

        // Print left boundary
        printLeftBoundary(root.left);

        // Print leaf nodes
        printLeaves(root.left);
        printLeaves(root.right);

        // Print right boundary (in reverse)
        printRightBoundary(root.right);
    }

    // Print left boundary (excluding leaves)
    static void printLeftBoundary(Node node) {
        while (node != null) {
            if (node.left != null || node.right != null) { // Exclude leaf nodes
                System.out.print(node.data + " ");
            }
            node = (node.left != null) ? node.left : node.right;
        }
    }

    // Print all leaf nodes in left-to-right order (inorder traversal)
    static void printLeaves(Node node) {
        if (node == null) {
            return;
        }

        printLeaves(node.left);
        if (node.left == null && node.right == null) { // It's a leaf node
            System.out.print(node.data + " ");
        }
        printLeaves(node.right);
    }

    // Print right boundary (excluding leaves, in bottom-up order)
    static void printRightBoundary(Node node) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (node.left != null || node.right != null) { // Exclude leaf nodes
                stack.push(node.data);
            }
            node = (node.right != null) ? node.right : node.left;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Print in reverse order
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        
        int n = sc.nextInt(); // Read the number of elements
        int[] arr = new int[n];
        
        System.out.println("Enter each node:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read elements into array
        }
        sc.close();

        Node root = buildTree(arr);
        boundaryTraversal(root);
    }
}
