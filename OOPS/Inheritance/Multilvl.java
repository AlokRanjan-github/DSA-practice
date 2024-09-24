public class Multilvl {
    public static void main(String[] args) {
        BlackPeople b = new BlackPeople(); // creating object the constructor gets automatically invoked
        // LivingThings -> Humans -> BlackPeople
        System.out.println(b); // just to remove error local variable not used
    }
}

class LivingThings{
    LivingThings(){
        System.out.println("Living thing constructor is called");
    }
}
class Humans extends LivingThings{
    Humans(){
        System.out.println("Human constructor is called");
    }
}
class BlackPeople extends Humans{
    BlackPeople(){
        System.out.println("BlackPeople constructor is called");
    }
}
