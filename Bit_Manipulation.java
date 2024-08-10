import java.util.*;
public class Bit_Manipulation{

    public static void EvenOdd(int n){
        
        int bit =1;

        if((n & bit) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
        
    }
    public static int getIthBit(int n,int i){
        
        int bit =1<<i;

        if((n & bit) == 0){
            return 0;        }
        else{
            return 1;
        }
        
    }
    public static int SetIthBit(int n,int i){
        
        int bit =1<<i;

        return n | bit;

    }  

      public static int clearIthBit(int n,int i){
        
        int bit =~(1<<i);

        return n & bit;
        
    }
     public static int clearIthBit1(int n,int i){
        
        int bit = (~0)<<i;  //suppose number is 15 the left shit it means it make starting two digit 0 but negation make it 1 and last digit 0

        return n & bit;
        
    }

    public static int clearIthBitrange(int n,int i,int j){
        
        int a = ((~0)<<j+1);  //j=4 then j start from making number 1 from 5 so (j+1)
        int b = (1<<i)-1;     // i range is 2 then i make a number 1 from the 2 postion then 1 and then 0 position so (i-1)

        int bitmask = a|b;

        return n & bitmask;
        
    }
    
      public static int SetCountBit(int n){

        int count =0;
        
        while(n>0){
            if((n & 1) !=0){
                count ++;   
            }
            n = n>>1;
        }
        return count;
        
    }

    
      public static int exponetial(int a, int n){

        int ans = 1;
        
        while(n>0){
            if((n & 1) !=0){
                ans = ans*a;   
            }
            a=a*a;
            n = n>>1;
        }
        return ans;
        
    }

 
    public static void main(String args []){
        // EvenOdd(1);
        // EvenOdd(4);
        System.out.println(getIthBit(10,));
        System.out.println(SetIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        // System.out.println(clearIthBit1(15,2));
    //     System.out.println(clearIthBitrange(10,2,4));
        System.out.println(SetCountBit(10));
        System.out.println(exponetial(5,3));
    // }
    }
}