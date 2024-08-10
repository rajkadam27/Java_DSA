import java.util.*;

class Simple{

    void bottle(){
        int a = 10 , b=20;
        int c = a+b;
        System.out.println(c);
    }
}
public class mult_java{


    
    public static void main(String args []){

        Simple s1 = new Simple();
        s1.bottle();

         Scanner s = new Scanner(System.in);
         
         String name;
         name  =  s.nextLine();
         System.out.println(name);

         System.out.println("enter num1");
         int num1 = s.nextInt();

         System.out.println("enter num2");
         int num2 = s.nextInt();

         int mult=num1*num2;
         System.out.println(mult);



         
         }
}
