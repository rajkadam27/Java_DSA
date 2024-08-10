import java.util.*;
public class calculator{
    
    public static void main(String args []){
        int a ,b;
        char operator;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the value of a");
        a = s.nextInt();
        
        System.out.println("enter the value of b");
        b = s.nextInt();
        
        System.out.println("enter the operator");
        operator = s.next().charAt(0);

        switch(operator){

            case '+' : System.out.println(a+b); 
            break;  
            
            case '-' : System.out.println(a-b); 
            break;  
            
            case '*' : System.out.println(a*b); 
            break;  
            
            case '/' : System.out.println(a/b); 
            break; 
            
            case '%' : System.out.println(a%b); 
            break;   

            default: System.out.println("error");

        }

    

    
}
}