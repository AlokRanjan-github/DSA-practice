import java.util.*;

class Graph {
    int V, E;
    List<List<Integer>> adjList; // Use List of Lists instead of array

    Graph(int n) {
        this.V = n;
        this.E = 0;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new LinkedList<>()); // No type casting needed
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

    void bfs(int start) {
        if (start < 0 || start >= V) {
            System.out.println("Invalid BFS starting node: " + start);
            return;
        }
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);

        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int neighbor : adjList.get(u)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
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
public class BFS {
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

        System.out.print("Enter BFS starting node: ");
        int startNode = sc.nextInt();
        g.bfs(startNode);

        g.printGraph();

        sc.close();
    }
}
