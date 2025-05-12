import java.util.LinkedList;

public class BuildingTrees {

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

    static int index = -1; // Start at -1 to ensure correct incrementing

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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static Node buildTreeUsingString(String str) {
        if (str.isEmpty() || str.equals("-1")) {
            return null;
        }

        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < ip.length) {
            Node currNode = queue.poll();

            if (!ip[i].equals("-1")) {
                currNode.left = new Node(Integer.parseInt(ip[i]));
                queue.add(currNode.left);
            }
            i++;

            if (i >= ip.length) {
                break;
            }

            if (!ip[i].equals("-1")) {
                currNode.right = new Node(Integer.parseInt(ip[i]));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    static Node buildTreeUsingArray(int[] values) {
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

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 }; // Example input

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
    }
}
