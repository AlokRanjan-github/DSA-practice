import java.util.Scanner;

public class ponkey{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many stars you want to be in your first line:");
        int input  =  sc.nextInt();
        System.out.println("Here is your pattern");
        for(int i = input; i>0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        sc.close();    
    }
}