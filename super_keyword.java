import java.util.*;

class Car{
    String color;
    Car(){
        System.out.println("running");
    }
}
class Animal extends Car{
    Animal(){    //super by using constructor
    super();
       System.out.println("animal");
    }
}

class Mammel extends Animal{
    Mammel(){
    super();
    super.color="brown";   // property acces using the super keyword
        System.out.println("mammels");
    }
}


public class super_keyword{
 
    public static void main(String args []){
        
      Mammel m = new Mammel();
      System.out.println(m.color);
    
    }
}