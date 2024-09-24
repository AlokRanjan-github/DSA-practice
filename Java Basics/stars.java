import java.util.*;

public class stars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no of stars you want in starting line");
        // int n = sc.nextInt();
        int n =5;
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
