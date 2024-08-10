import java.util.ArrayList;
import java.util.Collections;

public class MultiDaimention_ArrayList1 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Multilist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


            for(int i=1; i<=10; i++) {

                list1.add(i*1);
                list2.add(i*2);
                list3.add(i*3);
            }

            Multilist.add(list1);
            Multilist.add(list2);
            Multilist.add(list3);
            System.out.println(Multilist);

            for(int i=0; i<Multilist.size(); i++) {

            ArrayList<Integer> curr = Multilist.get(i);

            for(int j=0; j<curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
    }
}