public class allSub {
    public static void length(String str,int i){
        if (i == str.length()-1) {
            System.out.print(str.charAt(i));
            return;
        }
        for (int j = i; j < str.length(); j++) {
            String newStr = new String("");
            if (str.charAt(i) == str.charAt(j)) {
                newStr = str.substring(i, j+1);
                System.out.print(newStr+" ");
            }
        }
        length(str, i+1);
    }
    public static void main(String[] args) {
        length("aba", 0);
    }
}
