class Solution {

//     public int Solve(int [] cost , int i , int [] dp){

//         int l = cost.length;
//         if( i >= l) return 0 ;

// if( dp[i] != -1 ) return dp[i];

// int oneStep = cost[i] + Solve(cost , i +1, dp);
 

// int   twoStep = cost[i] +  Solve(cost  ,i+2 , dp);

//  return dp[i] = Math.min(oneStep , twoStep);

//     }
//     public int minCostClimbingStairs(int[] cost) {

//         int [] dp = new int[cost.length];
//         Arrays.fill(dp , -1);

//         return  Math.min(Solve(cost , 0 , dp) , Solve(cost , 1 , dp));

        
//     }

      

          public int minCostClimbingStairs(int[] cost) {

            int n = cost.length;
            int [] dp = new int [n+1];

            dp[0] = 0;
            dp[1]  = 0;

            for(int i = 2 ; i<= n ; i++){
                dp[i] = Math.min(dp[i-1] + cost[i-1] , dp[i-2] + cost[i-2]);
            }
 return dp[n];


            
}}