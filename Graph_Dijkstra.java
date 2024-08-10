import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class Graph_Dijkstra {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest , int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1, 2));
        graph[0].add(new Edge(0,2, 4));

        graph[1].add(new Edge(1,3, 7));
        graph[1].add(new Edge(1,2, 1));

        graph[2].add(new Edge(2,4, 3));

        graph[3].add(new Edge(3,5, 1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));

        
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path; 
        }

        @Override
        public int compareTo(Pair p2){ // comparison with other src and node pair in the graph
            return this.path - p2.path; // give shotest path
        }
    }


    public static void Dijkstra(ArrayList<Edge>[] graph , int src ){

        int dist[] = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE; //+infinity baki sagale src che dist atta staring la infinity asanar
            }
        }

        PriorityQueue<Pair> p = new PriorityQueue<>();
        boolean visit[] = new boolean[graph.length];
        p.add(new Pair(src, 0));

        while(!p.isEmpty())
        {
            Pair curr = p.remove();

            if(!visit[curr.n])
            {
                visit[curr.n] = true;

                for(int i=0; i<graph[curr.n].size(); i++)
                {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u]+wt < dist[v])
                    {
                        dist[v] = dist[u]+wt;
                        p.add(new Pair(v , dist[v]));
                    }
                }
            }
        }

        for(int i=0 ; i<dist.length ; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]) {

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        Dijkstra(graph, src);
    }
} 