public class StringCompression {
    public static void Compress(String str){
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer newString = new StringBuffer("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newString.append(str.charAt(i));
            if(count > 1){
                newString.append(count.toString());
            }
        }
        System.out.println(newString.toString());
    }
    public static void main(String[] args) {
        String word = "aaaaaabbbcdeee";
        Compress(word);
    }
}
