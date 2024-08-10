import java.util.ArrayList;
import java.util.Stack;

public class Graph_Topological_sorting {

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

    public static void topSorttil(ArrayList<Edge>[] graph, int curr, boolean visit[], Stack<Integer> s) {

        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visit[e.dest]) {
                topSorttil(graph, e.dest, visit, s);
            }
        }

        s.push(curr);
    }

    public static void topSort(ArrayList<Edge>[] graph) {

        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                topSorttil(graph, i, visit, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String args[]) {

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}