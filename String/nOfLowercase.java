import java.util.Scanner;
public class nOfLowercase {
    public static void NoOfLowercase(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
                if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
                    continue;
                }
                else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();
        NoOfLowercase(input);
        sc.close();
    }
}
