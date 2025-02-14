import java.util.Stack;

public class duplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Closing parenthesis
            if (ch == ')') {
                int count = 0;

                while (s.pop() != '(') {
                    count++;
                }
                if (count<1) {
                    return true; //Duplicate exists
                }
            }
            else{
                //opening paranthesis, operators, operands
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b)*(a-b))";
        String str2 = "(((a+b)+(a-b)))";

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
