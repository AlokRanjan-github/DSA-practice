public class allSub {
    static int count=0;
    public static void length(String str,int i){
        if (i == str.length()-1) {
            count++;
            System.out.print(str.charAt(i)+"\n");
            return;
        }
        for (int j = i; j < str.length(); j++) {
            String newStr = new String("");
            if (str.charAt(i) == str.charAt(j)) {
                count++;
                newStr = str.substring(i, j+1);
                System.out.print(newStr+" ");
            }
        }
        length(str, i+1);
    }
    public static void main(String[] args) {
        length("abcab", 0);
        System.out.println(count);
    }
}
