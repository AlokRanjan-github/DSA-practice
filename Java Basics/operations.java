import java.util.*;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }    
}
