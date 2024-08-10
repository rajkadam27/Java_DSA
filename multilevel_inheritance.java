import java.util.*;

class Car{
    String speed;
    void speed(){
        System.out.println("running");
    }
}
class Animal extends Car{
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


public class multilevel_inheritance{
 
    public static void main(String args []){
        
        Mammel m = new Mammel();

        m.eat = "yes";
        System.out.println(m.eat);
        m.run();

        m.legs=2;
        System.out.println(m.legs);
        m.drink();

        m.speed="200km/hr";
        System.out.println(m.speed);
        m.speed();
      
    
    }
}