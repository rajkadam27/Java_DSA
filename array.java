import java.util.*;
public class array{
    
    public static void main(String args []){ 
        
        int marks[] = new int[5];
        // int arr[] = {1,2,3,4,5,6,7,8};
        // System.out.println(arr);

        Scanner s = new Scanner(System.in);

//input

        marks[0] = s.nextInt();
        
        marks[1] = s.nextInt();
        
        marks[2] = s.nextInt();

        //update 

        marks[2] = marks[2]+1;

        //output

        int persentage = (marks[0]+marks[1]+marks[2])/3;

        System.out.println("phy =" +marks[0]);
        System.out.println("chem =" +marks[1]);
        System.out.println("math =" +marks[2]);
        System.out.println("persentage =" +persentage+ "%");
        System.out.println("length of array =" +marks.length);


    }
}