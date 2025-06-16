import java.util.HashMap;
import java.util.Set;

// Majortiy element in an array is the number which appears more than (n/3) times 
public class majority {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,7,2,3,3,4,5,3,4,5,6,7,5,4,5,7,8,6};
        System.out.println("Array length: "+arr.length);

        HashMap<Integer, Integer> map = new HashMap<>();
        //short cut to count frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        // longcut to count frequency
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else{
                map.put(arr[i], 1);
            }
        }

        // to traverse
        Set<Integer> mySet = map.keySet();
        for (Integer element : mySet) {
            System.out.println("Key: "+element+" and Value: " +map.get(element));
        }
        // find majority
        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3){
                System.out.println("Majority element: "+ key);
            }
        }

        
    }
}
