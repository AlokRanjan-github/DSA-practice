import java.util.HashSet;
import java.util.Iterator;

public class distinct {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 23, 4, 55, 0 };
        HashSet<Integer> mySet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }
        System.out.println("No of Distinct elements: " + mySet.size());
        System.out.println("Iterating over Set");

        Iterator i = mySet.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
