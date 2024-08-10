import java.util.*;
public class sum_natural_number{
    
    public static void main(String args []){
        int n,value=1, sum=0;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the number");
        n = s.nextInt();
        
        while(n>value){
            value = value+1;
            sum = sum+value;
        }
            System.out.println("the sum of number is " +sum);


      
}
}