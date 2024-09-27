public class lastOccurance {

    public static int lastOccur(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] array = {1,3,3,7,5,5,6,7,3,4};
        System.out.println(lastOccur(array,7,0));
    }
}
