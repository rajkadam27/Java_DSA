import java.util.LinkedList;
import java.util.*;

public class BIpartiteGraph_cycle{

    static class Edge{
        int src;
        int dest;
        

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
        
        static void createGraph(ArrayList<Edge> graph[]){

         for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>(); 
        } 

        graph[0].add(new Edge(0,2)); 
        
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
       }

       public static boolean DFSutil(ArrayList<Edge>[] graph ,int curr, boolean visit[] , boolean stack[]){

        visit[curr] = true;
        stack[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!visit[e.dest] ){
                if(DFSutil(graph,e.dest,visit,stack)){
                     return true;
                }
              }
            }
         stack[curr] = false;
         return false;
       }


       public static boolean detectCycle(ArrayList<Edge>[] graph){

        // System.out.print(curr+" ");
        boolean visit[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){  
                if(DFSutil(graph,i,visit,stack)){
                    return true;
                }
            }
        }
           return false;
    }
    
       

    public static void main(String args[]){

        int v=4;  
        ArrayList<Edge>[] graph = new ArrayList[v]; 
        createGraph(graph);
        System.out.print(detectCycle(graph));
    

    } 
}


