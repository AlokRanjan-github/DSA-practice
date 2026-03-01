
public class longestWordwithAllPrefix {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            this.eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int indx = str.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static String finalAns = "";

    public static void getLongestWordWithAllPrefix(Node root, StringBuilder temp) {
        if (root == null) {
            return; // this case won't be hitted by code unless specified corner case is given
        }
        for (int i = 0; i < root.children.length; i++) { // This will print lexicographically order because loop is running 0-25 representing alphabetically order indexing
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > finalAns.length()) {
                    finalAns = temp.toString();
                }
                getLongestWordWithAllPrefix(root.children[i], temp);
                // Backtrack Step
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "a", "banana", "ap", "app", "appl", "apply", "apple" };
        for (String word : words) {
            insert(word);
        }
        getLongestWordWithAllPrefix(root, new StringBuilder(""));
        System.out.println(finalAns);

    }
}
