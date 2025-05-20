public class deleteBST {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insertBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            root.left = insertBST(root.left, data);
        } else {
            root.right = insertBST(root.right, data);
        }
        return root;
    }

    public Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 2 child
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }
        return root;
    }

    public Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (k2 < root.data) {
            printInRange(root.left, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        deleteBST bst = new deleteBST();
        int[] nodes = { 1, 3, 5, 8, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = bst.insertBST(root, nodes[i]);
        }

        // System.out.println("Inorder before deletion");
        // bst.Inorder(root);
        // root = bst.deleteNode(root, 6);
        // System.out.println("\nInorder after deletion");
        // bst.Inorder(root);

        System.out.println("Printing in range");
        bst.printInRange(root, 3, 11);
    }
}
