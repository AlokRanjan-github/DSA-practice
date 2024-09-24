import java.util.Scanner;

public class practice {

    //Add 1 to an integer using bits
    public static int AddOne(int n){
        return -(~n);
    }

    public static void swapping(int a, int b){
        //using arithmetic operations
        /*
        System.out.println("Before swap:\n a = "+a+" b = "+b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:\n a = "+a+" b = "+b);
         */
        //using XOR
        System.out.println("Using XOR\nBefore swap:\n a = "+a+" b = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap:\n a = "+a+" b = "+b);
    }

    public static char toLowerCase(char ch){
        return (char)(ch | 32);
    }

    public static void main(String[] args) {
        // System.out.println(AddOne(112));

        // swapping(10, 15);
        
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a uppercase character");
        String n = sc.next();
        char ch = n.charAt(0);
        System.out.println("Using bit Manupulation it's lowerCase is: " + toLowerCase(ch));
        sc.close();
    }
}
