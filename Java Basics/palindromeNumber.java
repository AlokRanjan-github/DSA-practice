public class palindromeNumber {

    public static boolean Palindrome(int a){
        int myNumber = a;
        int reverse=0;
        while(a>0){
            int lastDigit = a%10;
            reverse = (reverse*10)+lastDigit;
            a=a/10;
        }
        if (myNumber == reverse){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(Palindrome(12331));
    }
}