public class DP{
    
    public static int Memoisation_fibno(int n , int f[]){

        if(n==1 || n==0){
            return n;
        }

        if(f[n] != 0){
            return f[n];    
        }
        
        f[n] = Memoisation_fibno(n-1 , f) + Memoisation_fibno(n-2 , f);
        return f[n];

    }

    public static int tabulation_fibno(int n ){

        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2 ; i<=n ; i++){
            dp[i] =  dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
           

 public static void main(String args []){

        int n = 5;
        int f[] = new int[n+1];
        System.out.println(Memoisation_fibno(n, f));
        System.out.println(tabulation_fibno(n));
    }
}