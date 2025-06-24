public class prefixProblem {
    public static class Node {
        Node[] children = new Node[26];
        @SuppressWarnings("unused")
        boolean eow;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            this.eow = false;
            this.freq = 0;
        }
    }

    public static Node root = new Node();

    public static void insert(String str) {
        Node curr = root;
        for (int level = 0; level < str.length(); level++) {
            int indx = str.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
            curr.freq++;

        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }

    }

    public static void main(String[] args) {
        String[] words = { "zebra", "dog", "dove", "duck" };
        for (String word : words) {
            insert(word);
        }
        findPrefix(root, "");
    }
}
