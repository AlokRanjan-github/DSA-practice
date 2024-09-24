public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Alok Ranjan");
        s1.schoolName = "St.Joseph's school";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;
    
    void setName(String name){
        this.name = name;
    }

    String setName(){
        return this.name;
    }
}