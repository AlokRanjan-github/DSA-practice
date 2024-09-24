public class selection {
    public static void usingSelection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // till second last element
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {   // till last element
                if (arr[minPosition] > arr[j]) {   
                    minPosition = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }

    }

    public static void printElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 14, 100, 3, 46, 5, 6, 8 };
        printElement(array);
        usingSelection(array);
        printElement(array);
    }
}
