import java.util.HashSet;
import java.util.*;

public class Hashset_set_problem2{
    
    public static void main(String args[]){

        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int j = 0; j < arr.length; j++){

            sum += arr[j];
            if(m.containsKey(sum-k)){
                ans += m.get(sum-k);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }

        System.out.println(ans);

   } 
}


