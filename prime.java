import java.util.*;
public class prime{
    
    public static void main(String args []){
        int n;
        int div=2;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the number");
        n = s.nextInt();
        
        while(n>div){
            
            if(n%div==0){
                System.out.println("number is not prime ");
                // exit;
                break;
            }
            else{
                
                div=div+1;
            }
            System.out.println("number is prime");
        }
    }   
}
