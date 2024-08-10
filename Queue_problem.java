import java.util.LinkedList;
import java.util.Queue;
public class Queue_problem{

    public static void interleave(Queue<Integer> s){

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = s.size();

        for(int i = 0; i < size/2; i++){
            firstHalf.add(s.remove());
        }

        while(!firstHalf.isEmpty()){
            s.add(firstHalf.remove());
            s.add(s.remove());
        }

    }
    public static void main(String args[]){

     Queue<Integer> s = new LinkedList<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(10);

        interleave(s);

    
        while(!s.isEmpty()){
            System.out.println(s.remove()+" ");
        }
        System.out.println();
        
    }

}
