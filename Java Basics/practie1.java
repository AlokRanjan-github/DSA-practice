public class practie1 {

    public static float avg(float a, float b, float c){
        return (a+b+c)/3;
    }

    public static boolean isEven(int a){
        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        // System.out.println("Average of three numbers = " + avg(45f, 75f, 25.75f));
        System.out.println("given no is even = " + isEven(13));
    }
}
