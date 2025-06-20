
import java.util.HashMap;

public class TwoSum {
    public static int[] getTwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remainder = target - arr[i];
            if (map.containsKey(remainder)) {
                return new int[] {map.get(remainder),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        // int[] arr = {3,2,4};
        int[] arr = {2,7,11,15};
        int target = 18;
        int[] result = getTwoSum(arr,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
