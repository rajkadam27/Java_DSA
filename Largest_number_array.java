import java.util.*;
public class Largest_number_array{

    public static int Largest_number_array(int Numbers[]){
  
    int largest = Integer.MIN_VALUE;
    

        for(int i=0 ; i<Numbers.length ; i++){

            if(largest<=Numbers[i]){
                
                largest = Numbers[i];
            }
        }
            return largest;
        
    }
    public static int Smallest_number_array(int Numbers[]){
  
    int Smallest = Integer.MAX_VALUE;
    

        for(int i=0 ; i<Numbers.length ; i++){

            if(Smallest>=Numbers[i]){
                
                Smallest = Numbers[i];
            }
        }
            return Smallest;
        
    }
    
    public static void main(String args []){
        
        int Numbers[] = {2,4,6,8,100,12,14,16};

        int large = Largest_number_array(Numbers);
        int small = Smallest_number_array(Numbers);
        
        System.out.println("the largest number from array is = " +large);
        System.out.println("the smallest number from array is = " +small);


    }
}