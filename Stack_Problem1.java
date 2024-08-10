import java.util.*;
public class Stack_Problem1{

    public static void main(String args[]){

        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextInt[] = new int[arr.length]; 
  
         //back loop for right tracking 
        for(int i=arr.length-1 ; i>=0 ; i--){

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop(); 
            }

            if(s.isEmpty()){
                nextInt[i] = -1;
            }
            else{
                nextInt[i] = arr[s.peek()];
            }
            s.push(i);  
        }

        for(int i =0 ; i<nextInt.length ; i++){
            System.out.print(nextInt[i]+" ");
        }
        System.out.println();


//left side greater

        //  for(int i=0 ; i<=arr.length ; i++){

        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        //         s.pop(); 
        //     }

        //     if(s.isEmpty()){
        //         nextInt[i] = -1;
        //     }
        //     else{
        //         nextInt[i] = arr[s.peek()];
        //     }
        //     s.push(i);  
        // }

        // for(int i =0 ; i<nextInt.length ; i++){
        //     System.out.print(nextInt[i]+" ");
        // }
        // System.out.println();


    }
}
