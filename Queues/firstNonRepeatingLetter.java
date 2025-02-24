import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingLetter {

    public static void nonRepeatingLetter(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            // checking if any letter in queue has freq more than 1 if so removing it from queue

            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.poll();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepeatingLetter(str);
        
    }
}
