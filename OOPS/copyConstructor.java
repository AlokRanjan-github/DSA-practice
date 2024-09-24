public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.marks[0] = 90;
        s1.marks[1] = 91;
        s1.marks[2] = 92;
        s1.percentage = (float) 90.798;
        s1.batch = "apna college";
        
        System.out.println("First Object");
        System.out.println(s1.percentage);
        System.out.println(s1.batch);
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        
        Student s2 = new Student(s1);
        s1.marks[2] = 99;
        
        System.out.println("Second Object");
        System.out.println(s2.percentage);
        System.out.println(s2.batch);
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class Student {

    int[] marks = new int[3];
    float percentage;
    String batch;
    Student(){}
    
    // PARAMETRIZED CONSTRUCTOR

    // Student(int marks, float percentage, String batch){
    // this.marks=marks;
    // this.percentage= percentage;
    // this.batch=batch;
    // }

    //COPY CONSTRUCTOR

    Student(Student s) {
        this.marks = s.marks;
        this.percentage = s.percentage;
        this.batch = s.batch;
    }

}
