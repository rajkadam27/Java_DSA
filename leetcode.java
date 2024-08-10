import java.util.*;
public class leetcode{

    public static void upadate(int marks[] , int marks2[]){
        
        int marks3[]=new int[marks.length];
        
        for(int i=0 ; i<marks.length ; i++){

            marks3[i] = marks[i]+marks2[i];
            System.out.print(marks3[i] + " ");  
        }
        System.out.println();
    }
    
    public static void main(String args []){

        Solution s = new Solution();
        int marks[] = {2,4,3};
        int marks2[] = {5,4,6};
        upadate(marks,marks2);

    }
}