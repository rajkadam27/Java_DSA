public class DP_Problem3 {

    public static int knapsack_tabu(int val[], int wt[], int w ) {

    int n = val.length;
    int dp[][] = new int[n+1][w+1];

    for(int i=0; i<n+1; i++){  // 0th col
        dp[i][0] = 0;
    }

    for(int j=0; j<w+1; j++){  // 0th row
        dp[0][j] = 0;
    }

     for(int i=1; i<n+1; i++){
        for(int j=1; j<w+1; j++){

            

            if( wt[i-1] <= j){
                
                dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]],dp[i-1][j]);
            }
            else{
              
              dp[i][j] = dp[i-1][j];   
            }
        }
    }
    print(dp);
    return dp[n][w];
}
    public static void print(int dp[][]){
        for(int i=0 ; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();   
    }

           

 public static void main(String args []){

        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
       
        System.out.println(knapsack_tabu(val, wt, w));
    }
}