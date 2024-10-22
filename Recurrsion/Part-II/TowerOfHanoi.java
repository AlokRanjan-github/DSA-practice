import java.util.Stack;

public class TowerOfHanoi {
    // Function to move disks
    public static void moveDisks(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        // Move n-1 disks from the source to the auxiliary rod
        moveDisks(n - 1, fromRod, auxRod, toRod);
        // Move the nth disk from the source to the destination rod
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        // Move n-1 disks from auxiliary rod to destination rod
        moveDisks(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int N = 3; // Number of disks
        moveDisks(N, 'A', 'C', 'B'); // A, B, and C are the rods
    }
}
