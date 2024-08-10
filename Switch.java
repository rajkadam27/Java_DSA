import java.util.*;
public class Switch{
    
    public static void main(String args []){
        int n;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the value of n");
        n = s.nextInt();
        
        switch(n){
            case 1 :
                System.out.println("one");
                break;
            
            case 2:
                System.out.println("two;");
                break;

            default :
            System.out.println("none");
        }

    
}
}