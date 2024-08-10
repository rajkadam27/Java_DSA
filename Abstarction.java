import java.util.*;

abstract class Mammel {

    Mammel(){
        System.out.println("mammels constructor");
    }
    
    void run(){
        System.out.println("water");
    }

    abstract void walk();
}

class Animal extends Mammel{
    
    Animal(){
        System.out.println("animals constructor");
    }

    void walk(){
        System.out.println("wakling on 2 legs");
    }
}

class Cat extends Animal{
    Cat(){
         System.out.println("cat constructor");
    }
}

class Car extends Mammel{
    

    void walk(){
        System.out.println("wakling on 4 wheels");
    }
}





public class Abstarction{  
 
    public static void main(String args []){
        
      Animal a = new Animal();
      a.run();
      a.walk();

      Car c = new Car();
      c.run();
      c.walk();

      Cat d = new Cat();
      d.walk();
    
    }
}