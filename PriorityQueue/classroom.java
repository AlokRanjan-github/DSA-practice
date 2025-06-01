import java.util.PriorityQueue;

public class classroom {
    public static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Alok Ranjan", 11));
        pq.add(new Student("Parth", 1000));
        pq.add(new Student("Pranav", 120));
        while (!pq.isEmpty()) {
            Student s = pq.remove();
            System.out.println(s.name + "->" + s.rank);
        }
    }
}
