public class binarySearch {
    public static int usingBianrySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == num[mid]) {
                return mid;
            } else if (key < num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int set[] = {12,21,32,54,87,78,68,68,77,62,98,100};
        System.out.println("Key found at "+ usingBianrySearch(set,100)+"th index.");
    }
}