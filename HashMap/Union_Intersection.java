
import java.util.HashSet;
import java.util.Iterator;

public class Union_Intersection {
    public static void getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union: " + set.size());
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
    }
    
    public static void getIntersection(int[] arr1, int[] arr2){

        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i]+" "); 
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection: "+count);

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 7, 5, 7, 9, 8 };
        int[] arr2 = { 2, 4, 8, 2, 0, 7, 5, 7, 9, 8 };

        getUnion(arr1, arr2);
        getIntersection(arr1, arr2);

    }
}
