import java.util.*;

interface Mammel {


    public void run();
}

interface Animal {
    

     public void walk();
}


class Car implements Mammel,Animal{
    

    public void run(){
        System.out.println("speed is high");
    }

    public void walk(){
        System.out.println("walking");
    }
}

//jya method interface madhe ghetalya ahet tyach method class implemeys karatana ghecya

public class multiple_inheritance{  
 
    public static void main(String args []){

      Car c = new Car();
      c.walk();
      c.run();

    
    }
}