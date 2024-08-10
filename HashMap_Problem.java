import java.util.*;
import java.util.HashMap;

public class HashMap_Problem{

    public static boolean isAnagram(String s, String t){

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); // to add in hashmap ch and char frequency 
                                                 //if char not exits then it contain a 1 value and if exits then it increse the value
        }

        for(int i=0; i<t.length() ;  i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){ // jr not null asl tr ch get karayach ani bagayach ==1 ahe ka asl 
                                   //tr remove karayach nasal tr ch ghech add karayach ani frequency  decrese karayachi
   
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                 else{
                    map.put(ch,map.get(ch)-1);  
                }
            }
            else{
                return false;
            }
        }

        return map.isEmpty();
    }
    
    public static void main(String args[]){

        int arr[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for(int i=0; i<arr.length; i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }
            // else{
            //     map.put(arr[i],1);
            // }


// or 

            // map.put(arr[i] , map.getOrDefault(key, defaultValue)); 
            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1); 
        }

        Set<Integer> keySet = map.keySet();  
        // for(Integer key : keySet){
        //     if(map.get(key)>arr.length/3){
        //         System.out.println(key);
        //     }
// or
            for(Integer key : map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }

        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s,t));
    }
        
}


