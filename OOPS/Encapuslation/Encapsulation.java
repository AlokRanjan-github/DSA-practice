public class Encapsulation{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Alok Ranjan";
        s1.updateMarks(95);
        s1.calcPercentage(95, 98, 99);
        System.out.println(s1.name);
        System.out.println (s1.marks);
        System.out.println(s1.percentage);

    }
}

class Student{
    String name;
    int marks=0;
    float percentage=0;

    void calcPercentage(int phy, int chem, int bio){
        percentage = (float)(phy+chem+bio)/3;
    }
    void updateMarks(int m){
        marks = m;
    }
}