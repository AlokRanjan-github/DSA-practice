import java.util.Stack;

public class decoding {
    public static String decode(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currString = new StringBuilder("");
        int index = 0;

        while (index < str.length()) {
            char ch = str.charAt(index);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(str.charAt(index))) {
                    num = num * 10 + (str.charAt(index) - '0'); // Coverts into integer
                    index++;
                }
                index--;
                countStack.push(num);

            } else if (ch == '[') {
                resultStack.push(currString);
                currString = new StringBuilder("");
                index++;
            } else if (ch == ']') {
                StringBuilder temp = currString;
                currString = resultStack.pop();
                int repeatTimes = countStack.pop();
                while (repeatTimes-- > 0) {
                    currString.append(temp);
                }
                index++;

            } else {
                currString.append(ch);
                index++;
            }
        }
        return currString.toString();
    }

    public static void main(String[] args) {
        // String str = "2[b2[v]]L";
        String str = "2[A2[L]3[O]]K";
        System.out.println(decode(str));
        ;
    }
}
