public class mainPackage {

    public static void patternPyramid(int line){
        for (int i = 1; i <= line; i++) {
            //spaces
            for (int j = 1; j <= line-i; j++) {
                System.out.print(" ");
            }
            //stars
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        patternPyramid(10);
    }
}
