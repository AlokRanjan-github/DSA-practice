public class heirarchical {
    public static void main(String[] args) {
        Chicken ch = new Chicken();
    }    
}


//One base class and multiple derived / sub-class
class Animals{
    Animals(){
        System.out.println("Animal constructor called");
    }
}

class Monkey extends Animal{
    Monkey(){
        System.out.println("Monkey const. is called");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken const. is called");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse const. is called");
    }
}