public class sumOfDigits {
    public static int DigitSum(int a) {
        int sum = 0;
        {
            a = sum;
            while (a > 0) {
                int lastDigit = a % 10;
                sum = sum + lastDigit;
                a = a / 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DigitSum(153));
    }
}
