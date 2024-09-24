public class Singlelvl {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        System.out.println(m.milk());
        System.out.println(m.giveBirth);
        System.out.println(m.breathe);
        System.out.println(m.eats);
        m.legs(4);

    }
}


class Animal{
    boolean breathe;
    boolean eats;
    void legs(int n){
        System.out.println("Legs:"+n);
    }
}

class Mammal extends Animal{
    boolean giveBirth;
    boolean milk (){
        return true;
    }


}

