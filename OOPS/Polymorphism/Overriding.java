public class Overriding {
    public static void main(String[] args) {
        // Animal a = new Animal();
        // a.eats();

        Horse h = new Horse();
        h.eats();
    }
}


class Animal{
    void eats(){
        System.out.println("Animal eats anything. ");
    }
}

class Horse extends Animal{
    void eats(){
        System.out.println("Horse eats grasses.");
    }
}