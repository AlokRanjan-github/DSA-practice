public class tiltedHollowRectangle {

    public static void HollowRectFunction(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces for tilte
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRectFunction(10);
    }
}
