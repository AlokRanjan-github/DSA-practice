import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// public class sortByFreq {
//     public static void sortStringByFreq(String str){
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         TreeMap<Integer, Character> revMap = new TreeMap<>(Comparator.reverseOrder());
//         for (Character key : map.keySet()) {
//             revMap.put(map.get(key), key);
//         }

//         for (Integer freq : revMap.keySet()) {
//             char ch = revMap.get(freq);
//             for (int i = 0; i < freq; i++) {
//                 System.out.print(ch);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbcccdddd";
//         sortStringByFreq(str);
//     }
// }
// The above code logic works fine but if there is String with characters having same frequency TreeMap fails there

//Optimized approach

public class sortByFreq {
    public static String getSortByFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? a.getValue() - b.getValue() : b.getKey() - a.getKey());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        StringBuilder stb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry2 = pq.poll();
            char ch = entry2.getKey();
            int freq = entry2.getValue();

            while (freq-- > 0) {
                stb.append(ch);
            }

        }
        return stb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccdee";
        System.out.println(getSortByFreq(str));
        System.out.println('t'-'a');
    }

}