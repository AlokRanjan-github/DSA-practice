import java.util.*;
// public class creatingGraph {
//     public static class Edge{
//         @SuppressWarnings("unused")
//         int source;
//         int destination;
//         @SuppressWarnings("unused")
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.source = s;
//             this.destination =d;
//             this.weight= w;
//         }
        
//     }
//     public static void Bfs(ArrayList<Edge>[] graph){
//         System.out.println("BFS traversal:");
//         Queue<Integer> q = new LinkedList<>();
//         boolean[] visited = new boolean[graph.length];
//         int start = 0;
//         q.add(start);
//         while (!q.isEmpty()) {
//             int curr = q.poll();
//             if (!visited[curr]) {
//                 System.out.print(curr+" ");
//                 visited[curr] = true;
//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     int neighbours = graph[curr].get(i).destination;
//                     q.add(neighbours);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int V = 4;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         for (int i = 0; i < V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0,1,5));

//         graph[1].add(new Edge(1,0,4));
//         graph[1].add(new Edge(1,2,3));
//         graph[1].add(new Edge(1,3,2));

//         graph[2].add(new Edge(2,1,1));
//         graph[2].add(new Edge(2,3,2));

//         graph[3].add(new Edge(3,1,2));
//         graph[3].add(new Edge(3,2,2));

//         System.out.println("Printing neighbours of 2: ");
//         for (int i = 0; i < graph[2].size(); i++) {
//             Edge e = graph[2].get(i);
//             System.out.println(e.destination+" ");
//         }


//         Bfs(graph);
//     }


    
// }


public class creatingGraph{
    public static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int s, int d, int w){
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Vertices:");
        int V = sc.nextInt();
        // creatingGraph g = new creatingGraph();

        ArrayList<Edge>[] graph =  new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter no of Edges");
        int E = sc.nextInt();
        for (int j = 0; j < E; j++) {
            System.out.println("Enter Edges "+j+" source, destination, weight");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();
            graph[source].add(new Edge(source, destination, weight));
            graph[destination].add(new Edge(destination,source, weight));
        }

        for (int i = 0; i < graph.length; i++) {
            for (Edge e : graph[i]) {
                System.out.print(i);
                System.out.println(" -> " +e.destination+ " (w = "+e.weight+")");
            }
        }

    }
}