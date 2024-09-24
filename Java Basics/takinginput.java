import java.util.Scanner;

public class takinginput {
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter string");
        String name =  sc.nextLine();
        System.out.println("Enter no.");
        int no = sc.nextInt();
        System.out.println("your name is "+name+" and your no is "+no);
        sc.close();
    }
}
