public class InsertSearch {
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
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","thee", "any"};
        for(String word : words){
            insert(word);
        }

        System.out.println(search("anya"));
        System.out.println(search("there"));
        
    }
}
