class Solution {

    public int Solve(int coins[] , int amount  ,int i , Integer [][] dp ){
     int n = coins.length;

     if (i >= n || amount < 0) return -1 ;
     if (amount == 0) return 0 ;
    
    

    if (dp[i][amount] != null) return dp[i][amount];

      int skip = Solve(coins , amount , i +1 , dp);

      int take = -1;
       

       if (coins[i] <= amount ){
      int  res  =  Solve(coins , amount - coins[i] , i , dp);

        if (res != -1){
            take = 1 + res;
        }
       }
       if (skip == -1) return dp[i][amount] = take;
       if (take == -1) return dp[i][amount] = skip;

       return dp[i][amount] =  Math.min(take , skip );

         }
          
    public int coinChange(int[] coins, int amount) {
        

        Integer [][] dp = new Integer [coins.length +1][amount + 1]; 

        return Solve(coins , amount , 0  ,dp);
    }
}