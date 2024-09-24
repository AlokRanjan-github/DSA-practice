public class Overloading {

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return (float)a+b;
    }
    public static float sum(int a, float b){
        return (float)a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 15));
        System.out.println(sum(10, (float)15.25));
        System.out.println(sum((float)10.75,(float) 15.25));
        
        
    }
}

