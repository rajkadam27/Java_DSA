import java.util.Queue;
import java.util.LinkedList;
public class Queue_Collection{

    public static void main(String args[]){

        Queue<Integer> s = new LinkedList<>();  //ArrayDeque
        s.add(1);
        s.add(2);
        s.add(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
        
    }

}
