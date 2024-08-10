import java.util.*;
public class Strings_questions{

    public static String toUpperCase(String str){
       
       StringBuilder  sb = new StringBuilder(""); 

       char ch  = Character.toUpperCase(str.charAt(0)); //string madhil 1st character la uppercha madhe convert kel str.charAt(0);
       sb.append(ch);  

       for(int i=1 ; i<str.length() ; i++){
        if(str.charAt(i) == ' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
       }
       else{
        sb.append(str.charAt(i));
       }
    }
    
     return sb.toString(); 
    }

    public static String compress(String str1){

        String newstr = " ";
         for(int i=0 ; i<str1.length() ; i++) {
            Integer count = 1;
            while(i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1)){
                i++;
                count ++;
            }
            newstr += str1.charAt(i);    
            if(count>1){
                newstr +=count.toString();
        }
            
    }   
    return newstr;
}

    public static void main(String args []){

     //to find the biggest string

        String fruits[] = {"apple" , "banana" , "mango"};

        String largest = fruits[0];

        for(int i=1 ; i<fruits.length ; i++){

            if(largest.compareTo(fruits[i])<0){

            largest = fruits[i];
            }
        }
        System.out.println(largest);
        

        String str = "hi , i am raj";
        System.out.println(toUpperCase(str));

        String str1 = "aaabbccaddc";
        System.out.println(compress(str1));

    }
}

