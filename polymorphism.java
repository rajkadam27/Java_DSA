import java.util.*;

class Mammel {
    int legs;
    void run(){
        System.out.println("water");
    }
}

class Animal extends Mammel{
    
    String eat;
    @Override void run(){
        System.out.println("eating");
    }
}

class calculator{

    int sum (int a, int b){
        return a+b;
    }

    float sum(float a , float b){
        return a+b;
    }

    int sum (int a, int b , int c){
        return a+b+c;
    }

}



public class polymorphism{  
 
    public static void main(String args []){
        
        // Animal a = new Animal();
        // a.run();

        Mammel m = new Mammel();
        m.run();
        Mammel a = new Animal();
        a.run();


        calculator c = new calculator();

        System.out.println(c.sum(1,2));
        
        System.out.println(c.sum(1.5f,2.5f));
        
        System.out.println(c.sum(1,2,3));

        
      
    
    }
}