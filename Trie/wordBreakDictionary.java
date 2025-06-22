public class wordBreakDictionary {
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

    public static void insert(String str){
        Node curr = root;
        for (int level = 0; level < str.length(); level++) {
            int indx = str.charAt(level)-'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    
    public static boolean search(String str){
        Node curr = root;
        for (int level = 0; level < str.length(); level++) {
            int indx = str.charAt(level)-'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }
    
    public static boolean wordBreak(String key){
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] words = {"i","sam","samsung","like"};
        String key = "ilikesamsung";

        for (String word : words) {
            insert(word);
        }

        System.out.println("Does it exist in dictionary? "+ wordBreak(key));

    }
}
