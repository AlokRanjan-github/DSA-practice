public class bubble {
    public static void usingBubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {  // till second last element outer loop will run;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {14,10,3,46,5,6,8};
        printElement(array);
        usingBubble(array);
        printElement(array);
    }
}
