import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queue_Problem{

    
    static class Row implements Comparable<Row>{
        int Soldiers;
        int idx;

        Row(int Soldiers, int idx){
            this.Soldiers = Soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.Soldiers == r2.Soldiers){ //if soldiers count is same then sort on the basis of index

                return this.idx - r2.idx;
            }
            else{
                return this.Soldiers - r2.Soldiers;
            }
        }
    }

    public static void main(String args[]){

        int ropes[]  = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();  
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;

        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min+min2;
            pq.add(min+min2);
        }
        System.out.println("the cost is " + cost);

        int army [][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
            };
            int k = 2; 

            PriorityQueue<Row> q = new PriorityQueue<Row>();
            
            for(int i = 0; i <army.length; i++){
                int count = 0;

                for(int j = 0; j <army[i].length; j++){
                    count+=army[i][j]==1?1:0;
                }

                q.add(new Row(count,i)); 
            }

            for(int i = 0; i <k ; i++){
                System.out.println("R"+q.remove().idx);
            }
        }
        
}


