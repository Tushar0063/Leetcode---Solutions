class Solution {
 public int Solve(int amount , int [] coins , int i , int [][] dp ){

  int n = coins.length;
  if ( i >= n || amount < 0) return 0 ;
  if (amount == 0) return 1;
  
if (dp[i][amount] != -1) return dp[i][amount];
  int skip = Solve(amount , coins , i+1 , dp);

  int take = 0 ;
  if(coins[i] <= amount){
    take = Solve(amount - coins[i] , coins , i , dp);
  }  

  return dp[i][amount] = (take + skip);
 }

    public int change(int amount, int[] coins) {
        
        int [][] dp  = new  int [coins.length +1][amount +1 ];
        
        for (int [] num : dp){
            Arrays.fill( num , -1);
        }
        return Solve(amount , coins , 0 , dp);
    }
}