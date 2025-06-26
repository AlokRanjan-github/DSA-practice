

public class allUniqueSubstrings {
    public static class Node{
        Node children[] = new Node[26];
        @SuppressWarnings("unused")
        boolean endOfWord;

        public Node(){
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            this.endOfWord = false;
        }
    }
    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        for (int level = 0; level < str.length(); level++) {
            int indx = str.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.endOfWord = true;
    }
    
    // Unique substrings can be get using = all unique prefixes(last cut) of all suffix(first cut)
    public static void getUniqueSubtrings(StringBuilder str){
        for (int i = 0; i < str.length(); i++) {
            // finding suffixes
            String suffix = str.substring(i);
            // Creating trie with all suffixes gives unique nodes
            insert(suffix);
        }
        // count of each node in trie = no of uniques substrings
        System.out.println(countNodesOfTrie(root));
    }
    public static int countNodesOfTrie(Node root){
        if (root == null) {
            return 0;
        }
        int count =0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodesOfTrie(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        // getUniqueSubtrings(new StringBuilder("ababa"));
        getUniqueSubtrings(new StringBuilder("apple"));
    }
}
