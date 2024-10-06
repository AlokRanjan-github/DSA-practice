public class lengthOfString {
    public static int findLength(String str,int i){

        if(i==str.length()){
            return i;
        }
        return findLength(str, i+1);
    }

    //Another approach 

    public static int findLength_2(String s){
        if (s.equals("")) {
            return 0;
        }
        return 1 + findLength_2(s.substring(1));
    }

    public static void main(String[] args) {
        String str = "Alokranjan";
        System.out.println(findLength(str, 0));
        System.out.println(findLength_2(str));
    }
}
