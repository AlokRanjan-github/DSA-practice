import java.util.LinkedList;
import java.util.Queue;

// import javax.swing.tree.TreeNode;

public  class cat2 {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node buildTree(int[] nodes){
        if (nodes.length ==0 || nodes[0] ==-1) {
            return null;
        }
        Node root = new Node(nodes[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i<nodes.length) {
            Node currNode = q.poll();
            if (nodes[i] != -1 ) {
                currNode.left = new Node(nodes[i]);
                q.add(currNode.left);
            }
            i++;
            if (i>=nodes.length) {
                break;
            }
            if (nodes[i] != -1) {
                currNode.right = new Node(nodes[i]);
                q.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void levelOrder(Node root){
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currNode = q.poll();

            System.out.print(currNode.data+" ");
            
            if (currNode.left != null) {
                q.add(currNode.left);
            }
            
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -1, 5, -1, 4 };
        Node root = buildTree(arr);

        levelOrder(root);
    }
}
