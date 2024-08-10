import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_water_container {

    public static int setWater(ArrayList<Integer> height){

        int maxWater = 0;
        for(int i = 0; i < height.size(); i++){
            for(int j=i+1 ; j<height.size() ; j++){
                int ht = Math.min(height.get(i) , height.get(j) );
                int wd = j-i;
                int currWater = ht*wd;
                maxWater = Math.max(maxWater, currWater);

            }
        }

        return maxWater;

    }

    public static int setWater1(ArrayList<Integer> height){

// two pointer approch 

        int maxWater = 0;
        int lp =0;
        int rp = height.size()-1;
        
        if(lp < rp){
        
                int ht = Math.min(height.get(lp) , height.get(rp) );
                int wd = rp-lp;
                int currWater = ht*wd;
                maxWater = Math.max(maxWater, currWater);

                if(height.get(lp) < height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }
        }

        return maxWater;

    }

    public static boolean ArraySum(ArrayList<Integer> height ,int target){

        for(int i = 0; i < height.size(); i++){
            for(int j=i+1 ; j<height.size() ; j++){
                if(height.get(i) + height.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ArraySum1(ArrayList<Integer> height ,int target){
      //2 pointer approch

        int lp = 0;
        int rp = height.size()-1;
        
        while(lp != rp){

            if(height.get(lp)+height.get(rp) == target){
                return true;
            }
            if(height.get(lp)+height.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }

        return false;

    }

    public static boolean ArraySumpair2 (ArrayList<Integer> height ,int target){
      //2 pointer approch

        int bp = -1;
        int n = height.size();
        
        for(int i = 0; i < height.size(); i++){
            
            if(height.get(i)>height.get(i+1)){
                bp =i;
                break;
            }
        }

        int lp = bp+1;  // samllest
        int rp = bp;    // largest

        while(lp != rp){

            if(height.get(lp)+height.get(rp) == target){
                return true;
            }
            if(height.get(lp)+height.get(rp) < target){
                lp = (lp+1)%n;
                
            }
            else{
                rp = (rp-1)%n;
            }
        }
     return false;
    }

    

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>();

        height.add(1);
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(setWater(height));
        System.out.println(setWater1(height));
        System.out.println(ArraySum(height,5));
        
        System.out.println(ArraySum1(height,5));

        int target = 16;
        System.out.println(ArraySumpair2(height,target));

    }
}