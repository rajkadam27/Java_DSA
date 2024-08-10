import java.util.*;

class Animal{
    String eat;
    void run(){
        System.out.println("eating");
    }
}

class Mammel extends Animal{
    int legs;
    void drink(){
        System.out.println("water");
    }
}


public class single_inheritance{
 
    public static void main(String args []){
        
        Mammel m = new Mammel();

        m.eat = "yes";
        System.out.println(m.eat);
        m.run();

        m.legs=2;
        System.out.println(m.legs);
        m.drink();
      
    
    }
}