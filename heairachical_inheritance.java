import java.util.*;

class Mammel {
    int legs;
    void drink(){
        System.out.println("water");
    }
}

class Car extends Mammel{
    String speed;
    void speed(){
        System.out.println("running");
    }
}
class Animal extends Mammel{
    String eat;
    void run(){
        System.out.println("eating");
    }
}



public class heairachical_inheritance{
 
    public static void main(String args []){
        
        Animal a = new Animal();

        a.eat = "yes";
        System.out.println(a.eat);
        a.run();

        a.legs=2;
        System.out.println(a.legs);
        a.drink();

        
        Car c = new Car();

        c.speed="200km/hr";
        System.out.println(c.speed);
        c.speed();

        c.legs=2;
        System.out.println(c.legs);
        c.drink();
      
    
    }
}