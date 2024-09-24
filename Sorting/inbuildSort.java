import java.util.Arrays;
import java.util.Collections;
public class inbuildSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printRevArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int arr[]){
        Arrays.sort(arr);
        printArr(arr);
    }
    
    public static void main(String[] args) {
        int array[] = {1,2,8,7,6,6,5,8,9,95,5};
        printArr(array);
        sort(array);
        System.out.println("\n");
        Integer revArray[] = {1,2,2,3,5,48,55,4};
        printRevArr(revArray);
        Arrays.sort(revArray,Collections.reverseOrder());
        printRevArr(revArray);
    }
}
