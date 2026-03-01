import java.util.*;

public class topoBFS {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static ArrayList<Edge>[] createGraph(int V){
        ArrayList<Edge> graph[] = new ArrayList[V]; 
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Example DAG
         // Edges of DAG
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 4, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 6, 1));
        graph[4].add(new Edge(4, 6, 1));
        graph[5].add(new Edge(5, 2, 1));

        return graph;
    }

    public static void inDegree(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int curr = i;
            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);
                indeg[e.dest]++;

            }
        }
    }

    public static void topoSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        inDegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = createGraph(V);
        topoSort(graph);
    }
}
