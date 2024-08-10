import java.util.*;
public class add_java{
    
    public static void main(String args []){

         Scanner s = new Scanner(System.in);
         
         System.out.println("enter the value of num1");
         int num1 = s.nextInt();

         System.out.println("enter the value of num2");
         int num2 = s.nextInt();

         int add = num1 + num2;

         System.out.print(add);
    }
}