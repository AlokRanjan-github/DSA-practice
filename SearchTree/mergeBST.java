import java.util.ArrayList;

public class mergeBST {
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

    public Node buildBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public void getInorder(Node root, ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }
    public Node createBSTfromSortedArray(Node root, ArrayList<Integer> list,int start, int end){
        if (start>end) {
            return null;
        }
        int mid = (start+end)/2;
        root = new Node(list.get(mid));
        root.left = createBSTfromSortedArray(root.left, list, start, mid-1);
        root.right = createBSTfromSortedArray(root.right, list, mid+1, end);
        return root;
    }

    public Node mergeTwoBST(Node root1, Node root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        getInorder(root1,list1);
        getInorder(root2,list2);
        int i=0,j=0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                finalList.add(list1.get(i));
                i++;
            } else {
                finalList.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }
        while (j<list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }
        Node finalRoot=null;
        return createBSTfromSortedArray(finalRoot,finalList,0,finalList.size()-1);
    }
    public void preOrder(Node root ){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = null,root2 = null;
        mergeBST bst = new mergeBST();
        int[] arr1 = {1,5,2,6,3,7,8};
        int[] arr2 = {11,15,12,161,13,17,31,81};
        for (int i = 0; i < arr1.length; i++) {
            root1 = bst.buildBST(root1, arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            root2 = bst.buildBST(root2, arr2[i]);
        }
        Node mergeRoot = bst.mergeTwoBST(root1, root2);
        bst.preOrder(mergeRoot);

    }
}
