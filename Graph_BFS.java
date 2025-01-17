import java.util.LinkedList;
import java.util.*;

public class Graph_BFS{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
        
        static void createGraph(ArrayList<Edge> graph[]){

        
         for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>(); 
        } 

        graph[0].add(new Edge(0,1,1)); 
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[5].add(new Edge(6,5,1));

       }

       public static void BFS(ArrayList<Edge>[] graph){
        
            Queue<Integer> q = new LinkedList<>();
            boolean visit[] = new boolean[graph.length];
            q.add(0);

            while(!q.isEmpty()){
                int curr = q.remove();
                if(!visit[curr]){
                    System.out.print (curr+" ");
                    visit[curr] = true;
                    for(int i=0; i<graph[curr].size(); i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }

       }

       public static void DFS(ArrayList<Edge>[] graph, int curr , boolean visit[]){

        System.out.print(curr+" ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!visit[e.dest]){
            DFS(graph , e.dest , visit);
            }
        }
       }
       
       public static boolean hasPath(ArrayList<Edge>[] graph, int src , int dest , boolean visit[]){

        if(src==dest){
            return true;
        }

        visit[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);

            if(!visit[e.dest] && hasPath(graph , e.dest , dest , visit)){
                return true;
            }
        }
        return false;
       }

    public static void main(String args[]){

        int v=7;  
        ArrayList<Edge>[] graph = new ArrayList[v]; 
        createGraph(graph);
        BFS(graph);
        System.out.println();
        DFS(graph,0,new boolean[v]);
        System.out.println();
        System.out.println(hasPath(graph,0,5,new boolean[v]));
    

    } 
}


