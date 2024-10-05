public class BinaryString {

    public static void BinaryNoConsecutiveOnes(int n, int lastPlace, String str){
        if (n==0) {
            System.out.println(str);
            return;
        }
        BinaryNoConsecutiveOnes(n-1, 0, str+"0");
        if (lastPlace == 0) {
            BinaryNoConsecutiveOnes(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        String str = "";
        BinaryNoConsecutiveOnes(3, 0, str );
    }
}
