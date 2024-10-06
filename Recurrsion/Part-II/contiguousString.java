public class contiguousString {

    public static int countSubstringsFromIndex(String s, int i) {
        if (i == s.length()) {
            return 0;
        }
        int count = 0;
        for (int j = i; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            }
        }

        return count + countSubstringsFromIndex(s, i + 1);
    }

    public static void main(String[] args) {
        String S1 = "aba";
        System.out.println("Number of substrings: " + countSubstringsFromIndex(S1, 0));
    }
}
