public class searchInSortedArray {
    public static void oneWayLinearSearch(int arr[][], int key) {
        System.out.println("Using linear Search");
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Key found at (" + i + "," + j + ")");
                    flag = true;
                }

            }
        }
        if (flag == false) {
            System.out.println("Key not found");
        }
    }

    public static void secondWayBinarySearch1(int arr[][], int key) {
        System.out.println("From top right corner");
        boolean flag = false;
        int row = 0, col = arr[0].length - 1;
        while (row <= arr.length - 1 && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("Key found at (" + row + "," + col + ")");
                flag = true;
            }
            if (key <= arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        if (flag == false) {
            System.out.println("Key not found");
        }
    }
    
    public static void secondWayBinarySearch2(int arr[][], int key){
        System.out.println("From bottom left corner");
        boolean flag = false;
        int row = arr.length-1, col = 0;
        while(row >= 0 && col <= arr[0].length-1 ){
            if (key == arr[row][col]) {
                System.out.println("Key found at (" + row + "," + col + ")");
                flag = true;
            }
            if (key <= arr[row][col] ) {
                row--;
            }
            else{
                col++;
            }
        }
        if (flag == false) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        oneWayLinearSearch(matrix, 8);
        secondWayBinarySearch1(matrix, 125);
        secondWayBinarySearch2(matrix, 15);
    }
}