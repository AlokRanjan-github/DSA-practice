public class isSorted {

    public static boolean Sorted(int[] arr, int index){
        if (index == (arr.length-1)) {
            return true;
        }
        if (arr[index]>arr[index+1]) {
            return false;
        }
        return Sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,8,4,5,6,};
        System.out.println(Sorted(array,0));
    }
}
