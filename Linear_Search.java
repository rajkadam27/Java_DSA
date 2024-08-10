import java.util.*;
public class Linear_Search{

    public static int Linear_Search(int Numbers[] , int key){

        for(int i=0 ; i<Numbers.length ; i++){

            if(Numbers[i]==key){
                return i;
            }
        }
            return -1;
        
    }
    
    public static void main(String args []){
        
        int Numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        
        int index = Linear_Search(Numbers,key);

        if(index == -1){
           System.out.println("element is not present");
        }
        else{
            System.out.println("element is present at index " +index);
        }


    }
}