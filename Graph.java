import java.util.LinkedHashSet;
import java.util.*;

public class Graph{

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

    public static void main(String args[]){

        int v=5;  // total 5 vertex
        ArrayList<Edge>[] graph = new ArrayList[v];  // graph by using arraylist

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();  // loop till to 5 and store each value as a list i.e list for 1 , list for 2 , list for 3
        }

        graph[0].add(new Edge(0,1,5)); // value given from the edge constructor and added into a arraylist object  

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        graph[0].add(new Edge(4,2,2));

        //2's neighbours 

        for(int i=0 ; i<graph[2].size() ; i++){
            Edge e = graph[2].get(i);  // class edge boject creation
            System.out.println(e.dest);
        }

    } 
}


