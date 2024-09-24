// package Stars;

public class hollowRectangle {
    public static void pattern(int totrow, int totcol){
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcol; j++) {
                if(i==1 || j==1 || i == totrow || j == totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pattern(5, 10);
    }
}
