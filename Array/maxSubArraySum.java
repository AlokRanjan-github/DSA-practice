public class maxSubArraySum {

    public static void maxSubArraySum_Bruteforce(int arr[]) {
        System.out.println("Using Bruteforce");
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
    }

    public static void maxSubArraySum_PrefixArray(int arr[]) {
        System.out.println("Using prefix array");
        int prefix[] = new int[arr.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("The maximum sum is : " + maxSum);
    }

    public static boolean allNegative(int[] arr) {
        for (int num : arr) {
            if (num >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void maxSubArraySum_Kadan_s(int arr[]) {
        System.out.println("Using Kadan_s");
        if (allNegative(arr) == true) {
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(maxSum<arr[i]){
                    maxSum = arr[i];
                }
            }
            System.out.println("MaxSubArray sum : "+maxSum);

        } else {
            int cs = 0, ms = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                cs = cs + arr[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            System.out.println("MaxSubArray Sum : " + ms);

        }

    }

    public static void main(String[] args) {
        int array[] = { -2,-3,-1,0,-3};
        // maxSubArraySum_Bruteforce(array); // Bruteforce
        //maxSubArraySum_PrefixArray(array); // PrefixArray
        maxSubArraySum_Kadan_s(array); // Kadan_s
    }
}