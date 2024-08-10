import java.util.ArrayList;
import java.util.Collections;

public class MultiDaimention_ArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Multilist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list.add(1); 
        list.add(2);
        Multilist.add(list);

        list1.add(3); 
        list1.add(4);
        Multilist.add(list1);

        for(int i=0; i<Multilist.size(); i++) {

            ArrayList<Integer> curr = Multilist.get(i);

            for(int j=0; j<curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(Multilist);
    }
}