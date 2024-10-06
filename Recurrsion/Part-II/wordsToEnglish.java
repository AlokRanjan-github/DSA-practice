public class wordsToEnglish {
    public static String toEnglish(int n) {
        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (n < 10) {
            return words[n];
        }
        return toEnglish(n / 10) + " " + words[n % 10];

    }

    /*
     * First call: numberToWords(2019) → calls numberToWords(201) and adds "nine".
     * Second call: numberToWords(201) → calls numberToWords(20) and adds "one".
     * Third call: numberToWords(20) → calls numberToWords(2) and adds "zero".
     * Base case: numberToWords(2) returns "two".
     */

    public static void main(String[] args) {
        int num = 2019;
        System.out.println(toEnglish(num));
    }
}
