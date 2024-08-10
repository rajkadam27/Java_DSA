import java.util.*;
public class function{

//1

    public static void hello(){
        System.out.println("hello");
        System.out.println("hello");
        return;
    }

//2

    public static void cal(int num1 , int num2){
        int sum = num1+num2;
        System.out.println("the sum is " +sum);
        return;
    }

//3

    public static void product(int num1 , int num2){
        int product = num1*num2;
        System.out.println("the product is " +product);
        return;
    }

//4

    public static void factorial(int n){
        int f =1;
        for(int i=1 ; i<=n; i++){
            f = f*i;
        System.out.println("the factorial is " +f);
        }
        return;
    }

//5
    
    // public static int Bionomialcoeef(int n , int r){

    //    int Bionomial =factorial(n)/(factorial(r)*factorial(n-r)) ;
    //    System.out.println(Bionomial);
    //     return;
    // }

    
    public static void main(String args []){
    
    hello();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    cal(a,b);
    product(a,b);
    product(10,10);
    factorial(4);
    // Bionomialcoeef(5,10);

      
}
}