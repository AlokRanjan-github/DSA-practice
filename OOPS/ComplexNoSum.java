public class ComplexNoSum {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 9);
        Complex c2 = new Complex(11, 11);
        Complex.sum(c1, c2);
        
    }
}

class Complex{
    int real;
    int img;
    
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

     static void sum(Complex c1, Complex c2){
        int sumReal = c1.real+c2.real;
        int sumImg = c1.img+c2.img;
        System.out.println(c1.real + " + "+c1.img+ " i\n" + c2.real + " + "+c2.img+ " i\n"+ sumReal + " + "+sumImg+ " i" );
    
    }
}

