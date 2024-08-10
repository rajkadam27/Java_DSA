import java.util.ArrayList;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Graph_Problem {

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

    static void createGraph(int flights[][] , ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0 ; i < flights.length ; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
        
    }

    static class Info  {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost , int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops; 
        }

    }


    public static int CheapestFlight(int n, int flights[][] ,int src , int dest , int k ){

        ArrayList<Edge> graph [] = new ArrayList[n];
        createGraph(flights,graph); 

        int dist[] = new int[n];

        for(int i=0; i<n ; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE; //+infinity baki sagale src che dist atta staring la infinity asanar
            }
        }

        Queue<Info> p = new LinkedList<>();
        p.add(new Info(src, 0 , 0));

        while(!p.isEmpty()){

            Info curr = p.remove();
            if(curr.stops>k){
                break;
            }


            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                // if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v] && curr.stops <= k){
                //     dist[v] = dist[u]+wt;
                //     p.add(new Info(v , dist[v] , curr.stops+1));
                // }
                //or
                if( curr.cost+wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost+wt;
                    p.add(new Info(v , dist[v] , curr.stops+1));
                }
            }
            
        }

        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dest];
        }
    }


    public static void main(String args[]) {

        int n = 4;
        int flights[][]  = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0 , dest=3 , k=1;
        int result = CheapestFlight(n,flights,src,dest,k);
        System.out.println(result);

    }
} 