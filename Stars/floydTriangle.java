public class floydTriangle {
    public static void Triangle(int line){
        int counter = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle(5);
    }
}
