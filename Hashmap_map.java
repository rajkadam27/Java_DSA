import java.util.HashMap;
import java.util.*;

public class Hashmap_map{

    public static void main(String args[]){

        HashMap<String,Integer> hm = new HashMap<>();  

        hm.put("india",100);
        hm.put("China",200);
        hm.put("USA",300);

        System.out.println(hm);

        // System.out.println(hm.get("india"));

        // System.out.println(hm.containsKey("india"));
        // System.out.println(hm.containsKey("japan"));

        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // System.out.println(hm.size());

        // hm.clear();
        // System.out.println(hm);
        // System.out.println(hm.isEmpty());

        //iterator

        Set<String> keys = hm.keySet();
        System.out.println(keys); 

        for(String k : keys){
            System.out.println("key " +k+ " ,value " +hm.get(k)); 
        }
    }     
}


