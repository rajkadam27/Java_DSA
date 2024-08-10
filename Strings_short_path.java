import java.util.*;
public class Strings_short_path{


    public static boolean isPallindrone(String str){

        int n = str.length();

        for(int i=0 ; i<str.length()/2 ; i++){

            if(str.charAt(i)==str.charAt(n-1-i)){
                return false;
            }
        }
        return false;
    }
    
    public static float short_path(String path){

        int x=0 , y=0;  

        for(int i=0 ; i<path.length() ; i++){
            char dir = path.charAt(i);

            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }

        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
        
    }

    
    public static String substring(String strr, int si , int ei){

        String substr="";

        for(int i=si ; i<ei ; i++){

         substr+=strr.charAt(i);
        }
        return substr;
    }

    public static void main(String args []){
        
        String str  = "raj kadam";
        String str2 = "raj";
        String str3 = new String("raj");
        
        if(str==str2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        
        if(str==str3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        if(str.equals(str3)){   // equals function only chek the value of the string
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }



        System.out.println(isPallindrone(str));

        String path = "WNEENESENNN";
        System.out.println(short_path(path));

        String strr = "raj kadam";
        // System.out.println(substr(strr,0,5));     // without using the string function
        System.out.println(substring(strr,0,5));   // using the string function


    }
}