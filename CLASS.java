import java.util.*;

 class pen{

    String color;
    int trip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTrip(int newtrip){
        trip = newtrip;
    }
    void chetana(){
        System.out.println("chetana");
    }

}

class bank{
    public String name;
    private int pass;

    void setpass(int newPass){
        pass = newPass;
    }

}
public class CLASS{
 
    public static void main(String args []){
        
        pen p = new pen();
        p.chetana();
        p.setColor("blue");
        System.out.println(p.color);
        p.setTrip(5);
        System.out.println(p.trip);

        bank b = new bank();
        b.name ="maharastra";
        System.out.print(b.name);
        // // b.setpass(123);
        // // System.out.println(b.pass);



    
    }
}