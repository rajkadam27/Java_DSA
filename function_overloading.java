public class function_overloading{
    
    public static int sum(int a, int b){
        return a+b;
    } 

    public static int sum(int a, int b, int c){
        return a+b+c;
    } 

    public static float sum(float a , float b){
        return a+b;
    } 

    public static boolean prime(int n){

        if(n==2){
            return true;
        }

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 
    
    public static boolean primeInRange(int n){


        for(int i=2 ; i<=n ; i++){

            if(prime(i)){

                System.out.print(i+" ");

            }
        }
            System.out.println();
        return true;
    } 

    
    public static void main(String args []){

    System.out.println(sum(1,3));
    System.out.println(sum(1,3,5));
    System.out.println(sum(1.2f , 3.2f));
    System.out.println(prime(8));
    System.out.println(primeInRange(20));
    

    }
}