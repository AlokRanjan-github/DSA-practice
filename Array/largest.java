public class largest {

    public static int maxMarks(int arr[]) {
        int key = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key < arr[i]) { 
                key = arr[i];
                index = i;
            }
        }
        System.out.println("At index no. "+ index);
        return key;
    }

    public static void main(String[] args) {
        int marks[] = {12, 34, 53, 55, 23, 56, 77, 99, 23, 44};
        System.out.println("The largest mark is: " + maxMarks(marks)); 
    }
}

