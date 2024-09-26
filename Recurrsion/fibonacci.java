public class fibonacci {
    public static int fibonacciSeries(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fib = fibonacciSeries(n-1)+fibonacciSeries(n-2);
        return fib;
    }
    public static void main(String[] args) {
        
        System.out.println(fibonacciSeries(7));
    }
}
