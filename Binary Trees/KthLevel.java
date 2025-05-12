public class KthLevel {
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

    public static class Index{
        int value = 0;
    }

    public static Node buildTree(int[] nodes){
        Index ind = new Index();
        return buildTreeHelper(nodes,ind);
    }

    public static Node buildTreeHelper(int[] nodes, Index ind){
        if (ind.value >= nodes.length || nodes[ind.value] ==-1) {
            ind.value++;
            return null;
        }
        Node newNode = new Node(nodes[ind.value++]);
        newNode.left = buildTreeHelper(nodes, ind);
        newNode.right = buildTreeHelper(nodes, ind);

        return newNode;
    }

    public static void KthLvLElement(Node root, int currLvl,int K){
        if (root == null) {
            return;
        }
        if (currLvl == K ) {
            System.out.print(root.data+" ");
            return;
        }
        KthLvLElement(root.left, currLvl+1, K);
        KthLvLElement(root.right, currLvl+1, K);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = buildTree(nodes);

        System.out.println("Kth Level Elements are: ");
        KthLvLElement(root, 0, 2);
    }
}
