public class Heirarchical {
    public static void main(String[] args) {
        Chicken ch = new Chicken();
        System.out.println(ch);//  to remove errrors
    }    
}


//One base class and multiple derived / sub-class
class WildAnimals{
    WildAnimals(){
        System.out.println("WildAnimals constructor called");
    }
}

class Chimpanzee extends WildAnimals{
    Chimpanzee(){
        System.out.println("Chimpanzee const. is called");
    }
}
class Chicken extends WildAnimals{
    Chicken(){
        System.out.println("Chicken const. is called");
    }
}
class Horse extends WildAnimals{
    Horse(){
        System.out.println("Horse const. is called");
    }
}