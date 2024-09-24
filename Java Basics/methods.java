import java.util.*;
public class methods{

    public static int factorial(int x){
        int f =1;
        for (int i = 1; i <=x; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        float bcoeff = nfact/(rfact*nmrfact);
        System.out.println("Binomial coefficient= "+bcoeff);
        sc.close();
    }
}