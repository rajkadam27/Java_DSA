import java.util.*;
public class fibnossi{
    
    public static void main(String args []){
        int n,a=0,b=1;


        Scanner s = new Scanner(System.in);

        System.out.println("enter the number");
        n = s.nextInt();

        for(int i=1 ; i<=n ; i++){
             System.out.print(a);
             int c=a+b;
             a=b;
             b=c;
        }
        
    }   
}
