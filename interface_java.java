import java.util.*;

interface Mammel {


    void walk();
}

class Animal implements Mammel{
    
//method cya pudh public lihav lagat
    public void walk(){
        System.out.println("wakling on 2 lehs");
    }
}


class Car implements Mammel{
    

    public void walk(){
        System.out.println("wakling on 4 wheels");
    }
}


public class interface_java{  
 
    public static void main(String args []){
        
      Animal a = new Animal();
      a.walk();

      Car c = new Car();
      c.walk();

    
    }
}