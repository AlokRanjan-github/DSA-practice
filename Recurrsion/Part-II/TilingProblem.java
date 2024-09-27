public class TilingProblem {
    public static int TilingProb(int n){
        if (n==0|| n==1) {
            return 1;
        }
        int vertical = TilingProb(n-1);
        int horizontal = TilingProb(n-2);
        int totalWays = vertical+horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProb(4));
    }
}
