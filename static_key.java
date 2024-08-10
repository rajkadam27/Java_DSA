import java.util.*;

class Student{
    int roll;
    String name;
    static int id;   // static keyword 

    // static function

    static int persntage(int a, int b, int c){
           return (a+b+c)/3;
    }

    void setname(String name){
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}



public class static_key{  
 
    public static void main(String args []){

          Student s = new Student();
          s.setname("raj");
          System.out.println(s.getname());
          s.id = 10;
          System.out.println(s.id);

          Student s1 = new Student();
        //   s1.id=11;
          System.out.println(s1.id);

          
          Student s2 = new Student();
          s2.id=11;
          System.out.println(s2.id);

          System.out.println(s.persntage(10,20,30));


    
    }
}