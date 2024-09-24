public class reverse {
    public static void getReverse(int arr[]){
        int first=0,last=arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int myArray[] = {34,6,87,7,6,56,45,45,4};
        getReverse(myArray);
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j]+" ");
        }
    }
}

