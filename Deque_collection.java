import java.util.LinkedList;
import java.util.*;

public class Deque_collection {

    public static void main(String args[]){

        Deque d = new LinkedList<>();

        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);

        System.out.println(d);

        d.addLast(4);
        d.addLast(5);
        System.out.println(d);

        d.removeFirst();
        System.out.println(d);

        System.out.println(d.getFirst());

        System.out.println(d.getLast());
        

    }

}