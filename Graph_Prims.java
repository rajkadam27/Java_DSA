import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class Graph_Prims {

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

        graph[0].add(new Edge(0,1, 10));
        graph[0].add(new Edge(0,2, 15));
        graph[0].add(new Edge(0,3, 30)); 

        graph[1].add(new Edge(1,0, 10));
        graph[1].add(new Edge(1,3, 40));

        graph[2].add(new Edge(2,0, 15));
        graph[2].add(new Edge(2,3, 50));

        graph[3].add(new Edge(3,1, 40));
        graph[3].add(new Edge(3,2, 50));
        
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v, int cost){
            this.v = v; 
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair P2){
            return this.cost - P2.cost;
        }
    }

    public static void MST_Prims(ArrayList<Edge>[] graph){

        PriorityQueue<Pair> q = new PriorityQueue<>(); 
        boolean visit[] = new boolean[graph.length];
        q.add(new Pair(0,0));
        int finalCost = 0;

        while(!q.isEmpty())
        {
            Pair curr = q.remove();

            if(!visit[curr.v])
            {
                visit[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0 ; i<graph[curr.v].size() ; i++)
                {
                    Edge e = graph[curr.v].get(i);
                    q.add(new Pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("minimum cost is "+finalCost);
         
    }

    
    public static void main(String args[]) {

        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        MST_Prims(graph);
    }
} 