import java.util.*;
public class Spiral_matrix{

    public static void  Spiral_matrix(int matrix[][] ){
          
          int startRow = 0 ;
          int startCol = 0 ;
          int endRow = matrix.length;
          int endCol = matrix[0].length;

          while(startRow <= endRow  && startCol <= endCol){
//top
            for(int j =startCol ; j<=endCol ; j++ ){
                System.out.println(matrix[startRow][j]+ " ");
            }
//right
            for(int i =startRow+1 ; i<=endRow ; i++ ){
                System.out.println(matrix[i][endCol]+ " ");
            }
//bottom
            for(int j =endCol-1 ; j>=startCol  ; j-- ){
                if(startRow==endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]+ " ");
            }
//left
            for(int i =endRow-1 ; i>=startRow+1  ; i-- ){
                if(startCol==endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]+ " ");

            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;   
          }
          System.out.println();
            // return;  
    }


    public static void main(String args []){
        
          int matrix[][] =
          {
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12},
          {13,14,15,16}
          }; 
        Spiral_matrix(matrix);

    }
}