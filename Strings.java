import java.util.*;
public class Strings{

    public static void printLetters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+ " ");

        }
        System.out.println();
    }

    public static boolean isPallindrone(String str){

        int n = str.length();

        for(int i=0 ; i<str.length()/2 ; i++){

            if(str.charAt(i)==str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
 
    public static void main(String args []){
        
        
// input from a user by using scanner class

        Scanner s = new Scanner(System.in);
        
        String name;
        name  = s.nextLine();
        System.out.println(name);
    
        String str = "Raj";
        String str2 = new String("kadam");

        System.out.println(str);
        System.out.println(str2);

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

// to print a letters

        // String full = str+ " " +str2;

        // printLetters(full);

        // str  = "raj";
        // System.out.println(isPallindrone(str));


    }
}