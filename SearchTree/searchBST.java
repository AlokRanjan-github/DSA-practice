public class searchBST {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insertBST(Node root, int data){
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

    public void Inorder(Node root){
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public boolean search(Node root, int key){
        // 4 cases to be handled 
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        searchBST bst = new searchBST();

        int[] nodes  = {10,5,7,8,4,3};
        Node root = null;
        
        for (int i = 0; i < nodes.length; i++) {
            root = bst.insertBST(root, nodes[i]);
        }

        bst.Inorder(root);
        int key =1;
        System.out.println("\n"+bst.search(root, key));
    

    }
}
