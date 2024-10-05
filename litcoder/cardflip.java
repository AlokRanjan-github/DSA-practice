import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class cardflip {
    public static int flipgame(int[] fronts, int[] backs) {
        Set<Integer> same = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                same.add(fronts[i]);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int num : fronts) {
            if (!same.contains(num)) {
                result = Math.min(result, num);
            }
        }

        for (int num : backs) {
            if (!same.contains(num)) {
                result = Math.min(result, num);
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frontsInput = sc.nextLine().split(" ");
        int[] fronts = new int[frontsInput.length];

        for (int i = 0; i < frontsInput.length; i++) {
            fronts[i] = Integer.parseInt(frontsInput[i]);
        }

        String[] backsInput = sc.nextLine().split(" ");
        int[] backs = new int[backsInput.length];

        for (int i = 0; i < backsInput.length; i++) {
            backs[i] = Integer.parseInt(backsInput[i]);
        }

        // cardflip game = new cardflip();
        System.out.println(flipgame(fronts, backs));

        sc.close();
    }
}