public class ShallowDeepCopy {
    public static void main(String[] args) {
        Company c1 = new Company(5600, (float)5.5);
        c1.employeInProject[0] = 3;
        c1.employeInProject[1] = 4;
        c1.employeInProject[2] = 6;
        
        System.out.println("For object C1\n"+c1.salary);
        System.out.println(c1.ratings);
        for (int i = 0; i < 3; i++) {
            System.out.println(c1.employeInProject[i]);
        }

        Company c2 = new Company(c1);

        System.out.println("For object C2\n"+c2.salary);
        System.out.println(c2.ratings);
        for (int i = 0; i < 3; i++) {
            System.out.println(c2.employeInProject[i]);
        }
    }
}

class Company{
    int salary;
    float ratings;
    int[] employeInProject = new int[3];

    Company(int salary, float ratings){
        this.salary = salary;
        this.ratings = ratings;
    }
    Company (Company c){
        this.salary = c.salary;
        this.ratings = c.ratings;
        for (int i = 0; i < employeInProject.length; i++) {
            this.employeInProject[i] = c.employeInProject[i];
        }

    }
}
