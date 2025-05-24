import java.util.ArrayList;

public class validBST {
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

    public Node insertBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }
    // checking Validation of BST
    public boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, max) && isValid(root.right, min, max);
    }

    // Mirroring of BST
    public Node mirrorBST(Node root){
        if (root == null) {
            return root;
        }
        Node leftSubtree = mirrorBST(root.left);
        Node rightSubtree = mirrorBST(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }

    // Creating a Balanced BST
    public Node createBalancedBST(int[] arr, int start, int end){
        if (start > end) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBST(arr, start, mid-1);
        root.right = createBalancedBST(arr, mid+1, end);
        return root;
    }

    //Coverting a BST to Balanced BST by getting a sorted array from it.
    public void getSorteArrayList(Node root, ArrayList<Integer> list ){
        if (root == null) {
            return;
        }
        getSorteArrayList(root.left);
        list.add(root.data);
        getSorteArrayList(root.right);
    }

    public Node convertBST2BalancedBST(Node root){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        getSortedList(Node root, sortedArray);
        int n = sortedArray.size();
        int[] arr = new int[n]
        
        for (int i = 0; i < n; i++) {
            arr[i] = sortedArray.get(i);
        }
        return createBalancedBST(arr, 0, n-1);
    }

    //Inorder traversal
    public void Inorder(Node root){
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 3, 10, 11, 14, 6 };
        Node root = null;
        validBST bst = new validBST();
        for (int i = 0; i < nodes.length; i++) {
            root = bst.insertBST(root, nodes[i]);
        }

        // Validate BST
        System.out.println("\nIs it valid BST ? " + bst.isValid(root, null, null));

        //Mirror BST
        System.out.println("\nBefore Mirror");
        bst.Inorder(root);
        root = bst.mirrorBST(root);
        System.out.println("\nAfter Mirror");
        bst.Inorder(root);

        // Balanced BST
        System.out.println("\nBalanced tree traversal:");
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node newRoot = bst.createBalancedBST(arr, 0, arr.length-1);
        bst.Inorder(newRoot);

    }
}
