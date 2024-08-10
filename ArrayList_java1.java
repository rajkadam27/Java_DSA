import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_java1 {

    public static void swap(ArrayList<Integer> list , int indx1 , int indx2){

        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

        int indx1 = 1 , indx2 = 2;
        swap(list , indx1 , indx2);
        System.out.println(list);
        
        // reverse array

        for(int i =list.size()-1 ; i >=0 ; i--) {
            System.out.print(list.get(i));
        }

        // maximum number

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) > max) {
                max = list.get(i);

                //or

                Math.max(max,list.get(i));
            }
        }
        System.out.println("\nMaximum Number : " +max);

    }
}