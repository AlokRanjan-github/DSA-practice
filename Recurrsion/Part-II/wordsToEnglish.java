public class wordsToEnglish {
    public static void toEnglish(int n) {
        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (n == 0) {
            return ;
        }
        int lastDigit = n%10;
        toEnglish(n/10);
        System.out.print(words[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int num = 2019;
        toEnglish(num);
    }
}
