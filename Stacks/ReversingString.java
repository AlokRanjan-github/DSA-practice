import java.util.*;

public class ReversingString {
    
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            s.append(ch);
        }
        str = s.toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println(result);
    }
}
