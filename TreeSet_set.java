import java.util.TreeSet;
import java.util.*;

public class TreeSet_set{

    public static void main(String args[]){

        TreeSet<Integer> hs = new TreeSet<>();  

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.add(1);   

        System.out.println(hs);
        // System.out.println(hs.size());

        // hs.remove(2);
        // System.out.println(hs);

        // if(hs.contains(2)){
        //     System.out.println("set contains");
        // }
        // else{
        //     System.out.println("set not contains");
        // }
        // hs.clear(); 
        // System.out.println(hs.isEmpty());

        // //iteration

        TreeSet<String> cities = new TreeSet<>(); 
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it =  cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //or

        for(String city : cities){
            System.out.println(city);
        }
   } 
}


