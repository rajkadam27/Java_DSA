import java.util.*;
public class swap{
    
    public static void main(String args []){

        int a,b,temp;


        Scanner s = new Scanner(System.in);

        System.out.println("enter the number of a");
        a = s.nextInt();

        System.out.println("enter the number of b");
        b = s.nextInt();

        // temp = s.nextInt();

        System.out.println("the value of a before swapping is :" +a );
        System.out.println("the value of b before swapping is :" +b);

        temp = a;
        a = b;
        b = temp ;

        System.out.println("the value after swapping is :");
        System.out.println("a = " +a );
        System.out.println("b= " +b);
        
    }   
}
