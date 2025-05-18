public class buildBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insertBst(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val<root.data) {
            root.left = insertBst(root.left, val);
        } else{
            root.right = insertBst(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes = {1,5,3,4,6,};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = insertBst(root, nodes[i]);
        }
        Inorder(root);
    }

}
