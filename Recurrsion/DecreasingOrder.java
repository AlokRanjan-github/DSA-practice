public class DecreasingOrder {

    public static void decramentOrder(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }

        System.out.print(n + " ");
        decramentOrder(n - 1);

    }

    public static void increamentOrder(int n){
        if (n ==  0) {
            System.out.print(n+" ");
            return;
        }
        increamentOrder(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        decramentOrder(10);
        System.out.println();
        increamentOrder(10);
    }
}
