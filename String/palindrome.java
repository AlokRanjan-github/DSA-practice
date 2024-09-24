public class palindrome {
    public static boolean checkPalindrome(String str){
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++) {
            // System.out.print(str.charAt(i)+" ");
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
            
        }
        return flag;
    }

    public static void main(String[] args){
        String  str1 = "RandyxdnaR";
        String str2 = new String("racecar");
        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));

        
    }
}
