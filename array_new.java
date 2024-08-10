import java.util.*;
public class array_new{

    public static void upadate(int marks[]){

        for(int i=0 ; i<marks.length ; i++){

            marks[i] = marks[i]+1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args []){
        
        int marks[] = {97,98,99};
        upadate(marks);


    }
}

int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    