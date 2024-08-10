import java.util.*;
public class diagonal_sum_matrix{

    public static int diagonal_sum_matrix(int matrix[][]){
          
          int sum=0;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
               if(i==j ){
                sum += matrix[i][j];
               } 
               else if (i+j == matrix.length-1){
                sum += matrix[i][j];
               }
            }
        }
        return sum;
             
    }



    public static boolean matrix_search(int matrix[][] , int key){

        // int row=0 , col = matrix[0].length-1;
        int row=matrix.length-1 , col = 0;

            while(row<matrix.length && col>=0){

               if(matrix[row][col] == key ){

                System.out.print("key is found at ("+row+" , "+col+")");
                return true;
               } 

            //    else if(key<=matrix[row][col]){     //for right top element (0,3)
            //            col--;
            //    }

            //    else{
            //     row++;
            //    }

               
               else if(key<=matrix[row][col]){  //for left bottom element (3,0)
                       row--;
               }

               else{
                col++;
               }

        }
             System.out.print("key is not found ");
            return false;
    }
    


    public static void main(String args []){
        
          int matrix[][] =
          {
          {1,2,31,40},
          {5,6,7,8},
          {9,10,11,12},
          {3,14,15,16}
          }; 
        
         System.out.println(diagonal_sum_matrix(matrix));
         matrix_search(matrix,3);
    }
}