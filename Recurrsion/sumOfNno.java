public class sumOfNno {
    public static int sumTill(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sumTill(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumTill(6));
    }
}
