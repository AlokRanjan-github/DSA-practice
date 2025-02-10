import java.util.Stack;

public class nextGreater {
    public static void bruteforceGreater(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                result[i] =-1;
                break;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    result[i]=arr[j];
                    break;
                }
                else{
                    result[i] = -1;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static void nextGreaterUsingStack(int[] arr){
        Stack <Integer> s = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length-1 ; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                result[i] = -1;
            }
            else{
                result[i] = arr[s.peek()];
            }

            s.push(i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        // int [] arr = {6,8,0,1,3};
        int[] arr = {4, 5, 2, 25, 7, 8};

        bruteforceGreater(arr);
        System.out.println();
        nextGreaterUsingStack(arr);

    }
}
