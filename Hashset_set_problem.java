import java.util.HashSet;
import java.util.*;

public class Hashset_set_problem{

    public static String getStart(HashMap<String,String> ticket){

        HashMap<String,String> RevMap = new HashMap<>();

        for(String key : ticket.keySet()){
            RevMap.put(ticket.get(key), key);   // changing start and end destination i.e start = end and end = start
        }

        for(String key : ticket.keySet()){
            if(!RevMap.containsKey(key)){
                return key;//starting point
            }
        }

        return null;
    }

    public static void main(String args[]){


        HashMap<String,String> ticket = new HashMap<String,String>();
        ticket.put("chennai", "bengaluru");
        ticket.put("Mumbai" , "Delhi");
        ticket.put("goa","chennai");
        ticket.put("Delhi","goa");

        String start = getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print("->" +ticket.get(start));
            start = ticket.get(start);
        }
        System.out.println();
//
        HashSet<Integer> hs = new HashSet<>(); 

        int num[] = {1,2,3,4,5,1,2,7,9};

        for(int i = 0; i < num.length; i++){
            hs.add(num[i]);
        } 

        System.out.println("size = " + hs.size());
//
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,6,2,4};

        HashSet<Integer> set = new HashSet<>(); 

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
 
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("set union = " + set.size());
        System.out.println("set union = " + set);

        set.clear();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        
        int count=0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        } 
        System.out.println("set intersection = " + count);

   } 
}


