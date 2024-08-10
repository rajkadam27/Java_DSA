import java.util.ArrayList;

public class ArrayList_java {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.size());

        //get
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // delete
        System.out.println(list.remove(1));
        System.out.println(list);

        //set

        System.out.println(list.set(1, 10));
        System.out.println(list);

        //contain
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));

        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        
        int index = list.indexOf(3);
        if (index != -1){
            System.out.println(index);
        }else{
            System.out.println("Not Found");
        }

        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);
        
        System.out.println(list.isEmpty());


    }
}