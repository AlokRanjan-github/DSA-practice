import java.util.Stack;

public class maxAreaHistogram {
    public static void maxArea(int[] arr) {

        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        int maxArea = 0;

        // next smaller right (j)
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left (i)
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Area calculation
        /*
         * height = arr[i]
         * width = j-i-1
         * area = height*width
         */
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum area in Histogram: " + maxArea);
    }

    public static void main(String[] args) {
        // int[] graph = { 2, 1, 5, 6, 2, 3 };
        int[] graph = { 2, 4};
        maxArea(graph);
    }
}
