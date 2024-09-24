public class diagonalSum {
    public static void firstWayDiagSum(int arr[][]) {
        System.out.println("Using bruteForce O(n^2)");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i == j){
                    sum+= arr[i][j];
                }
                if(i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void secondWayDiagSum(int arr[][]){
        System.out.println("Using Optimized approach O(n)");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            //primary diagonal (i== j)
            sum += arr[i][i];

            //secondary diagonal (i+j = arr.length-1)
            if (i != arr.length-1-i) {
                sum += arr[i][arr.length-1-i];
            }

        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        firstWayDiagSum(matrix);
        secondWayDiagSum(matrix);
    }

}
