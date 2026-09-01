class Solution {

    public int Solve(int [] cost , int i , int [] dp){

        int l = cost.length;
        if( i >= l) return 0 ;

if( dp[i] != -1 ) return dp[i];

int oneStep = cost[i] + Solve(cost , i +1, dp);
 

int   twoStep = cost[i] +  Solve(cost  ,i+2 , dp);

 return dp[i] = Math.min(oneStep , twoStep);




    }
    public int minCostClimbingStairs(int[] cost) {

        int [] dp = new int[cost.length];
        Arrays.fill(dp , -1);

        return  Math.min(Solve(cost , 0 , dp) , Solve(cost , 1 , dp));

        
    }
}