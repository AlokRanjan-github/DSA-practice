import java.util.*;

class Graph {
    int V, E;
    List<List<Integer>> adjList; // Use List of Lists instead of an array

    Graph(int n) {
        this.V = n;
        this.E = 0;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    void addEdge(int v, int u) {
        if (v < 0 || v >= V || u < 0 || u >= V) {
            System.out.println("Invalid edge: (" + v + ", " + u + ")");
            return;
        }
        adjList.get(v).add(u);
        adjList.get(u).add(v);
        E++;
    }

    void dfs(int start) {
        if (start < 0 || start >= V) {
            System.out.println("Invalid DFS starting node: " + start);
            return;
        }
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");

                // Reverse neighbor order to maintain proper DFS order
                List<Integer> neighbors = adjList.get(u);
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }

    void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        Graph g = new Graph(n);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter edges (v u):");
        for (int i = 0; i < edges; i++) {
            int v = sc.nextInt();
            int u = sc.nextInt();
            g.addEdge(v, u);
        }

        System.out.print("Enter DFS starting node: ");
        int startNode = sc.nextInt();
        g.dfs(startNode);

        g.printGraph();
        sc.close();
    }
}
