public class practice {
    // public static void allPairs(int arr[]){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             System.out.print("("+ arr[i]+","+arr[j]+")");
    //         }
    //         System.out.println();
    //     }
    // }
    
    
    public static void allSubarrays(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                if (sum>maxSum) {
                    maxSum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(maxSum);
        
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        // allPairs(array);
        allSubarrays(array);
    }
}
