public class recursion{

    public static void recursiondec(int n){

        if(n==1){
            System.out.println(n+" ");
            return;
        }

        System.out.print(n+ " ");
        recursiondec(n-1);

    }

    public static void recursioninc(int n){

        if(n==1){
            System.out.print(n+ " ");
            return;
        }

        recursioninc(n-1);
        System.out.print(n+ " ");

    }
    
    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        
        // int fnm = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }
    
    public static int sum_natural_number(int n){

        if(n==1){
           return 1;
        }
        
        // int sum_nm = sum_natural_number(n-1);
        int sum_n = n+sum_natural_number(n-1);
        return sum_n;

    }
    
    public static int fibno(int n){

        if(n==1 || n==0){
            return n;
        }
        
        // int f1 = fibno(n-1);
        // int f2 = fibno(n-2);
        // int fib = f1 + f2;
        // return fib;

        // or
        return fibno(n-1) + fibno(n-2);

    }
    
    public static boolean isSortedArr(int arr[] , int i){

        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSortedArr(arr,i+1);
    }

    
    public static int findindex(int arr[] ,int key, int i){

        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return findindex(arr,key,i+1);
    }   
        
    public static int power(int x, int n){

        if(n==0){
            return 1;
        }

        return x * power(x,n-1);
    }

    public static int optimisedpower(int a, int n1){

        if(n1==0){
            return 1;
        }

        int halfsq = optimisedpower(a,n1/2) * optimisedpower(a,n1/2);

        if(n1 % 2 != 0){
            halfsq = a * halfsq;
        }
        return halfsq;
    }

    public static void removeDuplicate(String str ,int idx ,StringBuilder newStr ,boolean map[]){

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a']==true){

            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str,idx+1,newStr.append(currChar) ,map);

        }
    }

        

 public static void main(String args []){

        String str = "appnnacollege";
        removeDuplicate(str, 0 ,new StringBuilder("") , new boolean[26]);

        int arr[] = {1,2,3,4,2};
    
        // System.out.println(optimisedpower(2,5));
        // System.out.println(power(2,10));
        System.out.println(isSortedArr(arr,0));
        System.out.println(findindex(arr,4,0));

        int n =5;
        System.out.println(fibno(5));
        System.out.println(factorial(n));
        System.out.println(sum_natural_number(n));
        recursiondec(n);
        recursioninc(n);

    }
}