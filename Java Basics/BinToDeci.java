// import java.util.*;

public class BinToDeci {

    public static int BinToDecimal (int n) {
        int binary = n;
        int power = 0;
        int deci = 0;
        while(n>0){
            int lastDigit = n%10;
            deci = deci + (lastDigit * (int)Math.pow(2, power));
            power++;
            n=n/10;
        }
        System.out.println( "Decimal of "+binary+" is "+ deci);
        return 0;     
    }

    public static void main(String[] args) {
        BinToDecimal(101);
    }
}
