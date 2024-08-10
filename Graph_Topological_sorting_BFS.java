import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Topological_sorting_BFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void CalIndegre(ArrayList<Edge>[] graph, int[] Indeg) {

        for (int i = 0; i < graph.length; i++) {
            // int v = i;
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                Indeg[e.dest]++;
            }
        }

    }

    public static void topSort(ArrayList<Edge>[] graph) {

        int Indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < Indeg.length; i++) {
            if (Indeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                Indeg[e.dest]--;
                if (Indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }

        }
        System.out.println();
    }

    public static void main(String args[]) {

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
} 