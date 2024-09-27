public class firstOccurance {
    public static int firstOccur(int[] arr, int key, int i){
        if (i == arr.length-1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,5,8,4,5,6,};
        System.out.println(firstOccur(array,10,0));
    }
}
