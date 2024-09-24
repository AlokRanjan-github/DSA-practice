public class AbstractSample {
    public static void main(String[] args) {
        Chicken c=new Chicken();
        c.eats();
        System.out.println(c.color);
        c.changeColor();
        System.out.println(c.color);
    }
}

// Abstract class doesn't lets you to create instance of its class
// But allows creating constructors 
abstract class Animal{
    
    String color;
    // constructor setting default color of animals to AllBlack untill changeColor function isn't called form sub-classes;
    Animal(){
        color = "All Black";
    }
    // Making abstract function means each sub-class which extends Base class(here Animal) "must" have to define abstract func. on their own classes
    abstract void eats();
}

class Chicken extends Animal{
    void changeColor(){
        color = "Chicken is Yellow";
    }
    // eats func. was mandatroy to create coz of abstract function eats was defined in base class;
    void eats(){
        System.out.println("Chicken eats insects");
    }
}
class Horses extends Animal{
    void changeColor(){
        color = "Horses are Brown";
    }
    void eats(){
        System.out.println("Horses eats Grasses");
    }
}

