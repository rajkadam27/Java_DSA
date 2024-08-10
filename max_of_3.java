import java.util.*;
public class max_of_3{
    
    public static void main(String args []){
        int a ,b ,c;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the value of a");
        a = s.nextInt();
        
        System.out.println("enter the value of b");
        b = s.nextInt();
        
        System.out.println("enter the value of c");
        c = s.nextInt();

    if(a>b){
        if(a>c){

            System.out.println("Greatest  value is =" +a);
        }
        else{

       System.out.println("Greatest  value is =" +c);
        }
    }
        
    
    else {
        if(b>c){

        System.out.println("Greatest  value is =" +b);
        }
    }

    
}
}