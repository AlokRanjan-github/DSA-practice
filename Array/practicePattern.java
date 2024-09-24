public class practicePattern {
    public static int getDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static int getButterfly(int n){
        for (int i = 1; i <= n; i++) {
            //stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }   
            //spaces    
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }
            //stars    
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            //stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }   
            //spaces    
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }
            //stars    
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getDiamond(10));
        System.out.println(getButterfly(10));
    }
}
