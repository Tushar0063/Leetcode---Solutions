class Solution {

    public int Solve(int nums [] , int curr , int prev , int [][] dp){

        int n = nums.length;
        if (curr >= n) return 0;
        if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];

        int skip = Solve(nums , curr +1 , prev , dp);
        int take = 0 ;

        if (prev == -1 || nums[curr] > nums[prev]){

            take  = 1 + Solve(nums , curr + 1 , curr , dp);
        }

        return  dp[curr][prev+1] = Math.max(take , skip);
    }
    public int lengthOfLIS(int[] nums) {
        
        
        int n= nums.length  ;

 int [][] dp = new int [n+2][n+2];

 for (int i = 0 ; i < n+2 ; i++){
    for (int j = 0 ; j < n+2 ; j++){

        dp[i][j] = -1 ;
    }
 }

 return Solve(nums , 0  , -1 , dp);

     //     return Solve(nums , 0 , -1 );
    }
}