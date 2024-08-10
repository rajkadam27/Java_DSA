import java.util.*;

class pen{
        
    String name;
    int pass;

    pen(pen p1){

        this.name=p1.name;
        this.pass = p1.pass; // corrected variable name

    }

    pen(String name){

        this.name=name;

    }
    pen(int pass){

        this.pass=pass;

    }

}


public class CLASS_constructor{
 
    public static void main(String args []){
        
      pen p1 = new pen();
      p1.name  = "raj";
      p1.pass = 123;

      pen p2 = new pen(p1);
      p2.pass = 890;
    
    }
}