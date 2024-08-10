import java.util.Scanner;
public class palindrome1{
    public static void main(String args[]){
      int n,sum=0;
      System.out.println("enter the value of n");
      Scanner Sc = new Scanner(System.in);
      n = Sc.nextInt();
      int temp = n;
      while(n != 0){
        int rem = n%10;
        sum = sum * 10 + rem ;
        n = n/10;
      }

          if(temp == sum){
        System.out.println("the number is palindrome");
      }
      else{
        System.out.println("not palindrome");
      }
      }
      
    
    
    
}