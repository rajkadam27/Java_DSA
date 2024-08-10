import java.util.*;
public class if_else{
    
    public static void main(String args []){
        int income;
        int tax =0;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the value of a");
        income = s.nextInt();
        

    if(income<5000){
        System.out.println("no tax");
    }
        
    else if(income>=50000 && income<=100000){
        tax = (int)(income*0.5);
        System.out.println("the tax is " +tax);

    }
    else {
        tax = (int)(income*0.9);
        System.out.println("the tax is " +tax);
    }

    
}
}