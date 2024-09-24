public class practiceProblem {
    public static void Question1(int arr[][], int toFind) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                largest = Math.max(largest, arr[i][j]);
            }
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                count[arr[i][j]]++;
            }
        }
        System.out.println(count[toFind]);
    }

    public static void Question2(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[1][j];
        }

        System.out.println(sum);
    }

    public static void Question3(int arr[][]){
        int row = arr.length,col = arr[0].length;
        
        int [][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printArray(transpose);
    }
    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] array1 = { {4,7,8},{8,8,7} };
        // Question1(array1, 1);
        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,8, 9 } };
        // Question2(array2);
        printArray(array2);
        System.out.println();
        Question3(array2);
    }
}
