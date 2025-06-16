import java.util.HashMap;

public class anagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char chr = t.charAt(i);
            if (map.get(chr) != null) {
                if (map.get(chr) == 1) {
                    map.remove(chr);
                } else {
                    map.put(chr, map.get(chr)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // String s = "race";
        // String t = "care";
        String s = "heart";
        String t = "earth";
        System.out.println("Is anagram: "+isAnagram(s,t));

    }
}
