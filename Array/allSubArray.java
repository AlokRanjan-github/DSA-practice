public class allSubArray {
    public static void getAllSubArray(int arr[]){
        int cntr =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                cntr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : "+cntr);
    }
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,7,8,9};
        getAllSubArray(array);
    }
}
