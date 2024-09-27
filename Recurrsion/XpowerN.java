public class XpowerN {
    public static int power(int x , int n){
        if (n == 1) {
            return x; 
        }
        int result = x * power(x, n-1);
        return result;
    }

    public static int OptimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }

        //Even power
        int result = OptimizedPower(x, n/2) * OptimizedPower(x, n/2);
        
        //Odd
        if((n & 1) != 0){
            result = x * result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(OptimizedPower(2, 9));
    }
}
