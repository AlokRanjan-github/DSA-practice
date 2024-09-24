public class DeciToBin {

    public static int DeciToBinary (int n){
        int deci = n;
        int binary=0;
        int power= 0 ;
        while (n>0) {
            int remainder = n%2;
            binary = binary + remainder*(int)(Math.pow(10, power));
            power++;
            n=n/2;
        }
        System.out.println("The binary of "+deci+" is "+binary);
        return 0;
    }


    public static void main(String[]args){
        DeciToBinary(5);
    }
}
