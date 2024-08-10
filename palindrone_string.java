
public class palindrone_string{
    
        public static void main(String args []){
             
           String str = "Rar", reverseStr = "";
    
            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
            }
            else {
            System.out.println(str + " is not a Palindrome String.");
            }
    }

}

// public class PalindromeChecker {  
// public static boolean isPalindrome(String str){  
//     StringBuilder sb=new StringBuilder(str);  
//     sb.reverse();  
//     String rev=sb.toString();  
//     if(str.equals(rev)){  
//         return true;  
//     }else{  
//         return false;  
//     }  
// }  
// }  
