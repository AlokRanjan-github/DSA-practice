public class subtree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildTree(int[] nodes) {
        Index idx = new Index();
        return buildTreeHelper(nodes, idx);
    }

    static class Index {
        int value = 0;
    }

    private static Node buildTreeHelper(int[] nodes, Index index) {
        if (index.value >= nodes.length || nodes[index.value] == -1) {
            index.value++; 
            return null;
        }
        Node newNode = new Node(nodes[index.value++]);
        newNode.left = buildTreeHelper(nodes, index);
        newNode.right = buildTreeHelper(nodes, index);
        return newNode;
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true; // If identical, return true immediately
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = buildTree(nodes);

        int nodes2[] = { 2, 4, -1, -1, 5, -1, -1 };
        Node subroot = buildTree(nodes2);

        System.out.println("Is this a subtree of the Tree: " + isSubtree(root, subroot));
    }
}
