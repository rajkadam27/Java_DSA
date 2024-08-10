nimport java.util.PriorityQueue;
import java.util.*;

public class Priority_Queue_problem{

    public static void main(String args[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }

}