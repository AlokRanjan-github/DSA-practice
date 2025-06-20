import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class sortByFreq {
    public static void sortStringByFreq(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        TreeMap<Integer, Character> revMap = new TreeMap<>(Comparator.reverseOrder());
        for (Character key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        for (Integer freq : revMap.keySet()) {
            char ch = revMap.get(freq);
            for (int i = 0; i < freq; i++) {
                System.out.print(ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abbcccdddd";
        sortStringByFreq(str);
    }
}
// The above code logic works fine but if there is String with characters having same frequency TreeMap fails there
