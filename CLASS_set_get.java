import java.util.*;

 class pen{

    String color;
    int trip;

    String getcolor(){
        return this.color;
    }

    int gettrip(){
        return this.trip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTrip(int newtrip){
        this.trip = newtrip;
    }

}


public class CLASS_set_get{
 
    public static void main(String args []){
        
        pen p = new pen();
        p.setColor("blue");
        System.out.println(p.getcolor());
        p.setTrip(5);
        System.out.println(p.gettrip());



    
    }
}