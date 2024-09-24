public class MultipleInheri {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.grass();
        b.flesh();
    }
}

interface Herbivores{
    void grass();
}

interface Carnivores{
    void flesh();
}

class Bear implements Herbivores, Carnivores{
    public void grass(){
        System.out.println("Eats grass also");
    }
    public void flesh(){
        System.out.println("Eats flesh also");
    }
}