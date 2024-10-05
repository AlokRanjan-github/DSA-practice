import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MaxChunksToMakeSorted {
    
    public static List<List<Integer>> maxChunksToSorted(int[] arr) {
        List<List<Integer>> chunks = new ArrayList<>();
        int max = 0;
        List<Integer> currentChunk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            currentChunk.add(arr[i]);
            max = Math.max(max, arr[i]);
            
            if (max == i) {
                chunks.add(new ArrayList<>(currentChunk));
                currentChunk.clear();
            }
        }
        
        return chunks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        List<List<Integer>> chunks = maxChunksToSorted(arr);
        
        for (List<Integer> chunk : chunks) {
            for (int num : chunk) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}