public class insertion {
    public static void usingInsertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i] ;
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 6, 5, 2, 3, 4, 1 };
        printArr(array);
        usingInsertion(array);
        System.out.println();
        printArr(array);
    }
}