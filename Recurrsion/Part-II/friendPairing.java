public class friendPairing {
    public static int friendPair(int n){
        //Base
        if(n==2|| n==1){
            return n;
        }
        int single = friendPair(n-1);
        int pair = (n-1)* friendPair(n-2);
        int totalWays = single+pair;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPair(5));
    }
}
