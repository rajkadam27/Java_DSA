import java.util.*;
public class Scanner_class{
    
    public static void main(String args []){

        Scanner s = new Scanner(System.in);

         System.out.println("enter the value of a");
         int a = s.nextInt();
         
         System.out.println("enter the value of b");
         int b = s.nextInt();

        int c = a*b;
        System.out.println("The Multiplication Of a and b is = " +c);
        
        int d = a+b;
        System.out.println("The Addition Of a and b is = " +d);

        System.out.println("enter the value of circle radius");
        float rad = s.nextFloat();

        float area = 3.14f * rad *rad ;
         System.out.println("the area of cicle is =" +area);
    }
}