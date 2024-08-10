import java.util.*;
public class Binary_Search{

    public static int Binary_Search(int Numbers[] , int key){
        
        int start=0 , end=Numbers.length-1;

        for(int i=0 ; i<Numbers.length ; i++){
            
            int mid = (start + end)/2;

            if(Numbers[mid] == key){
                return mid;
            }
            if(Numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
            return -1;
        
    }
    
    public static void main(String args []){
        
        int Numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        
        int index = Binary_Search(Numbers,key);

        if(index == -1){
           System.out.println("element is not present");
        }
        else{
            System.out.println("element is present at index " +index);
        }


    }
}