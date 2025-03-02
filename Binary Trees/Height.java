public class Height {

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

    static int index=-1;
    public static Node buildTree(int[] nodes){
        index++;
        if (index>=nodes.length || nodes[index] ==-1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static int Height(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int righttHeight = Height(root.right);
        int Height = Math.max(leftHeight, righttHeight)+1;
        return Height;
    }
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };

        Node root = buildTree(nodes);
        System.out.println("Root Node: "+root.data);

        System.out.println("Height of tree: "+ Height(root));
    }
}
