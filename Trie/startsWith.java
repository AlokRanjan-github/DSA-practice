public class startsWith {
    public static class Node{
        Node children[] = new Node[26];
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
    public static boolean search(String str){
        Node curr = root;
        for (int level = 0; level < str.length(); level++) {
            int indx = str.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.endOfWord == true;
    }

    public static boolean isStartingWith(String prefix){
        Node curr = root;
        for (int level = 0; level < prefix.length(); level++) {
            int indx = prefix.charAt(level)-'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","thee", "any", "apple", "mango","woman"};
        for(String word : words){
            insert(word);
        }

        // System.out.println(search("anya"));
        // System.out.println(search("there"));

        System.out.println("Any word starts with (moon)? "+ isStartingWith("moon"));
        System.out.println("Any word starts with (app)? "+ isStartingWith("app"));
        
    }
}

