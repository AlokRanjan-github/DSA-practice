import java.util.*;

class VerticalOrderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // TreeMap stores horizontal distance -> (depth, list of nodes)
    static TreeMap<Integer, ArrayList<int[]>> map = new TreeMap<>();

    // Recursive DFS to store nodes
    static void verticalOrderDFS(Node node, int hd, int depth) {
        if (node == null) {
            return;
        }

        // Add to TreeMap (hd -> (depth, node value))
        if (!map.containsKey(hd)) {
            map.put(hd, new ArrayList<>());
        }
        map.get(hd).add(new int[]{depth, node.data});

        // Recur for left and right children
        verticalOrderDFS(node.left, hd - 1, depth + 1);
        verticalOrderDFS(node.right, hd + 1, depth + 1);
    }

    static void printVerticalOrder(Node root) {
        if (root == null) {
            return;
        }
        
        map.clear(); // Reset map for fresh execution
        verticalOrderDFS(root, 0, 0); // Start DFS

        // Printing values in sorted order
        for (Map.Entry<Integer, ArrayList<int[]>> entry : map.entrySet()) {
            ArrayList<int[]> values = entry.getValue();

            // Sort by depth to maintain correct order
            Collections.sort(values, (a, b) -> Integer.compare(a[0], b[0]));

            for (int[] pair : values) {
                System.out.print(pair[1] + " ");
            }
        }
    }

    static Node build(String s[]) {
        if (s.length == 0 || s[0].equals("N")) {
            return null;
        }

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            Node curr = q.poll();

            if (!s[i].equals("N")) {
                curr.left = new Node(Integer.parseInt(s[i]));
                q.add(curr.left);
            }
            i++;

            if (i >= s.length) {
                break;
            }

            if (!s[i].equals("N")) {
                curr.right = new Node(Integer.parseInt(s[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        sc.close();

        Node root = build(s);
        printVerticalOrder(root);
    }
}
