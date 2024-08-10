import java.util.LinkedList;
public class LinkedList_collections{

    public static void main(String args[]){

        LinkedList<Integer> l = new LinkedList<Integer>();

        // add

        l.addFirst(2);
        l.addFirst(1);

        l.addLast(3);
        l.addLast(4);

        System.out.println(l);
        System.out.println(l.size());

        l.removeFirst();
        l.removeLast();
        System.out.println(l);
     
    }
}